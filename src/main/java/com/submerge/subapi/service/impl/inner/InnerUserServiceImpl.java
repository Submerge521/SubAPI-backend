package com.submerge.subapi.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.submerge.subapi.common.ErrorCode;
import com.submerge.subapi.exception.BusinessException;
import com.submerge.subapi.mapper.UserMapper;
import com.submerge.subapicommon.model.entity.User;
import com.submerge.subapicommon.service.inner.InnerUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * ClassName: InnerUserServiceImpl
 * Package: com.submerge.subapi.service.impl
 * Description:
 *
 * @Author Submerge--WangDong
 * @Create 2024-03-29 17:54
 * @Version 1.0
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if(StringUtils.isAnyBlank(accessKey)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("accessKey",accessKey);
        return userMapper.selectOne(userQueryWrapper);
    }
}
