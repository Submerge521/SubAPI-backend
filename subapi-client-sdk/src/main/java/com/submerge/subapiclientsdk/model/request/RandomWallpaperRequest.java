package com.submerge.subapiclientsdk.model.request;


import com.submerge.subapiclientsdk.model.enums.RequestMethodEnum;
import com.submerge.subapiclientsdk.model.params.RandomWallpaperParams;
import com.submerge.subapiclientsdk.model.response.RandomWallpaperResponse;
import com.submerge.subapiclientsdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: Submerge
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description:
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomWallpaperResponse> getResponseClass() {
        return RandomWallpaperResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
