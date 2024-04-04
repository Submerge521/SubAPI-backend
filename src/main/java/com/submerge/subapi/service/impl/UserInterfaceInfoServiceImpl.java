package com.submerge.subapi.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.submerge.subapi.common.ErrorCode;
import com.submerge.subapi.exception.BusinessException;
import com.submerge.subapi.mapper.UserInterfaceInfoMapper;
import com.submerge.subapi.service.InterfaceInfoService;
import com.submerge.subapi.service.UserInterfaceInfoService;
import com.submerge.subapi.service.UserService;
import com.submerge.subapicommon.model.entity.UserInterfaceInfo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;


/**
 * @author Lenovo
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
 * @createDate 2024-03-24 15:40:32
 */
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
        implements UserInterfaceInfoService {


    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        {
            Long id = userInterfaceInfo.getId();
            Long userId = userInterfaceInfo.getUserId();
            Long interfaceInfoId = userInterfaceInfo.getInterfaceInfoId();
            Integer totalNum = userInterfaceInfo.getTotalNum();
            Integer leftNum = userInterfaceInfo.getLeftNum();
            Integer status = userInterfaceInfo.getStatus();
            Date createTime = userInterfaceInfo.getCreateTime();
            Date updateTime = userInterfaceInfo.getUpdateTime();
            Integer isDelete = userInterfaceInfo.getIsDelete();

            if (userInterfaceInfo == null) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
            if (add) {
                if (userInterfaceInfo.getInterfaceInfoId() <= 0 || userInterfaceInfo.getUserId() <= 0) {
                    throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口或用户不存在");
                }
            }
            if (userInterfaceInfo.getLeftNum() < 0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余调用次数不能小于0");
            }

        }
    }


    /**
     * 统计调用次数
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */

    @Resource
    private InterfaceInfoService interfaceInfoService;
    @Resource
    private UserService userService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean invokeCount(Long interfaceInfoId, Long userId, Integer reduceScore) {
        LambdaQueryWrapper<UserInterfaceInfo> invokeLambdaQueryWrapper = new LambdaQueryWrapper<>();
        invokeLambdaQueryWrapper.eq(UserInterfaceInfo::getInterfaceInfoId, interfaceInfoId);
        invokeLambdaQueryWrapper.eq(UserInterfaceInfo::getUserId, userId);
        UserInterfaceInfo userInterfaceInvoke = this.getOne(invokeLambdaQueryWrapper);
        // 不存在就创建一条记录
        boolean invokeResult;
        if (userInterfaceInvoke == null) {
            userInterfaceInvoke = new UserInterfaceInfo();
            userInterfaceInvoke.setInterfaceInfoId(interfaceInfoId);
            userInterfaceInvoke.setUserId(userId);
            userInterfaceInvoke.setTotalNum(1);
            invokeResult = this.save(userInterfaceInvoke);
        } else {
            LambdaUpdateWrapper<UserInterfaceInfo> invokeLambdaUpdateWrapper = new LambdaUpdateWrapper<>();
            invokeLambdaUpdateWrapper.eq(UserInterfaceInfo::getInterfaceInfoId, interfaceInfoId);
            invokeLambdaUpdateWrapper.eq(UserInterfaceInfo::getUserId, userId);
            invokeLambdaUpdateWrapper.setSql("totalNum = totalNum + 1");
            invokeResult = this.update(invokeLambdaUpdateWrapper);
        }
        // 更新接口总调用次数
        boolean interfaceUpdateInvokeSave = interfaceInfoService.updateTotalNum(interfaceInfoId);
        // 更新用户钱包积分
        boolean reduceWalletBalanceResult = userService.reduceWalletBalance(userId, reduceScore);
        boolean updateResult = invokeResult && interfaceUpdateInvokeSave && reduceWalletBalanceResult;
        if (!updateResult) {
            throw new BusinessException(ErrorCode.OPERATION_ERROR, "调用失败");
        }
        return true;
    }


}




