package com.submerge.subapicommon.service.inner;



import com.submerge.subapicommon.model.entity.InterfaceInfo;

/**
 * @Author: Submerge
 *
 * @Version: 1.0
 * @Description: 接口信息服务
 */
public interface InnerInterfaceInfoService {
    /**
     * 获取接口信息
     *
     * @param path   路径
     * @param method 方法
     * @return {@link InterfaceInfo}
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
