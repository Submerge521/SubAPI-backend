package com.submerge.subapi.service.impl.inner;


import com.submerge.subapi.service.UserInterfaceInfoService;
import com.submerge.subapicommon.service.inner.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;


/**
 * @author Lenovo
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
 * @createDate 2024-03-24 15:40:32
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(Long interfaceInfoId, Long userId, Integer reduceScore) {
         return userInterfaceInfoService.invokeCount(interfaceInfoId, userId,reduceScore);
    }
}




