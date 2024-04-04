package com.submerge.subapiclientsdk.model.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Submerge
 * @Date: 2023/08/17 09:14:26
 * @Version: 1.0
 * @Description: 通用返回类
 */
@Setter
@Data
@NoArgsConstructor
public class ResultResponse implements Serializable {
    private static final long serialVersionUID = -6486005224268968744L;
    private Map<String, Object> data = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getData() {
        return data;
    }

}