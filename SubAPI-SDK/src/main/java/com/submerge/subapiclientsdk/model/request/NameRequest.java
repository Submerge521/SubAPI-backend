package com.submerge.subapiclientsdk.model.request;


import com.submerge.subapiclientsdk.model.enums.RequestMethodEnum;
import com.submerge.subapiclientsdk.model.params.NameParams;
import com.submerge.subapiclientsdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @Author: Submerge
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description:
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
