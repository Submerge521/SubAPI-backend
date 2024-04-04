package com.submerge.subapi.common;

import lombok.Data;

import java.io.Serializable;

/**
 * ID请求
 *
 * @author Submerge
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}