package com.submerge.subapicommon.model.dto;

import lombok.Data;

/**
 * @Author: Submerge
 *   
 * @Version: 1.0
 * @Description: 请求参数字段
 */
@Data
public class RequestParamsField {
    private String id;
    private String fieldName;
    private String type;
    private String desc;
    private String required;
}