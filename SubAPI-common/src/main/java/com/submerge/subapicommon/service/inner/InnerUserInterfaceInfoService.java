package com.submerge.subapicommon.service.inner;

/**
 * @Author: Submerge
 *
 * @Version: 1.0
 * @Description: 用户界面调用服务
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 援引
     * 接口调用
     *
     * @param interfaceInfoId 接口信息id
     * @param userId          用户id
     * @param reduceScore     降低分数
     * @return boolean
     */
    boolean invokeCount(Long interfaceInfoId, Long userId, Integer reduceScore);
}
