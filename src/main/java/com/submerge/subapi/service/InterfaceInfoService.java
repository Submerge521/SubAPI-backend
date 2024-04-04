package com.submerge.subapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.submerge.subapicommon.model.entity.InterfaceInfo;

/**
 * @author Lenovo
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2024-03-17 10:43:37
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    /**
     * 更新总调用数
     *
     * @param interfaceId 接口id
     * @return boolean
     */
    boolean updateTotalNum(long interfaceId);
}
