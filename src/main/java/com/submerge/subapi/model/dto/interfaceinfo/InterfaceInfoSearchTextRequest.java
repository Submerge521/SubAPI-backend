package com.submerge.subapi.model.dto.interfaceinfo;

import com.submerge.subapi.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Author: Submerge
 * @Date: 2023/09/04 11:33:35
 * @Version: 1.0
 * @Description: 界面信息搜索文本请求
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InterfaceInfoSearchTextRequest extends PageRequest implements Serializable {
    private static final long serialVersionUID = -6337349622479990038L;

    private String searchText;
}
