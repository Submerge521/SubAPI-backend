package com.submerge.subapi.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.submerge.subapicommon.model.entity.UserInterfaceInfo;
import org.springframework.transaction.annotation.Transactional;

/**
* @author Lenovo
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-03-24 15:40:32
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

 void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

 /**
  * 统计调用次数
  * @param interfaceInfoId
  * @param userId
  * @return
  */

 @Transactional(rollbackFor = Exception.class)
 boolean invokeCount(Long interfaceInfoId, Long userId, Integer reduceScore);
}
