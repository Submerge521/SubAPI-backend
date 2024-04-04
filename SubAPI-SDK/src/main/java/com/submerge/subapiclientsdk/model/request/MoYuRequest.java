package com.submerge.subapiclientsdk.model.request;


import com.submerge.subapiclientsdk.model.enums.RequestMethodEnum;
import com.submerge.subapiclientsdk.model.response.LoveResponse;
import com.submerge.subapiclientsdk.model.response.MoYuResponse;
import com.submerge.subapiclientsdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @Author: Submerge
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description: 摸鱼日历
 */
@Accessors(chain = true)
public class MoYuRequest extends BaseRequest<String, MoYuResponse> {

    @Override
    public String getPath() {
        return "/moYu";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<MoYuResponse> getResponseClass() {
        return MoYuResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
