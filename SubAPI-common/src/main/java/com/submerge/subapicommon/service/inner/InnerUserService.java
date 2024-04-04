package com.submerge.subapicommon.service.inner;


import com.submerge.subapicommon.model.entity.User;
import com.submerge.subapicommon.model.vo.UserVO;

/**
 * @Author: Submerge
 *
 * @Version: 1.0
 * @Description: 用户服务
 */
public interface InnerUserService {

    /**
     * 通过访问密钥获取invoke用户
     * 按凭证获取invoke用户
     *
     * @param accessKey 访问密钥
     * @return {@link User}
     */
    User getInvokeUser(String accessKey);
}
