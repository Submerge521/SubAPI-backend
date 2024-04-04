package com.submerge.subapi.model.vo;

import com.submerge.subapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * ClassName: InterfaceInfoVO
 * Package: com.submerge.subapi.model.vo
 * Description:
 *
 * @Author Submerge--WangDong
 * @Create 2024-03-30 15:43
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InterfaceInfoVO extends InterfaceInfo implements Serializable {


    /**
     * 接口总调用次数
     */
    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}
