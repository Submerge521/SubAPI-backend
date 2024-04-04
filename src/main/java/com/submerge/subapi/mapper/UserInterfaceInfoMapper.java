package com.submerge.subapi.mapper;




import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.submerge.subapicommon.model.entity.UserInterfaceInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author Lenovo
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-03-24 15:40:32
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    @Select("select interfaceInfoId, sum(totalNum) as totalNum from user_interface_info group by interfaceInfoId order by totalNum desc limit 3;")
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




