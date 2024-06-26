package com.submerge.subapiclientsdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: Submerge
 * @Date: 2023年09月17日 16:31
 * @Version: 1.0
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RandomWallpaperResponse extends ResultResponse {
    private static final long serialVersionUID = -6467312483425078539L;
    private String imgurl;
}
