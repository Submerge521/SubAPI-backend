package com.submerge.subapi.common;

/**
 * 返回工具类
 *
 * @author Submerge
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }



    /**
     * 错误
     *
     * @param data      数据
     * @param errorCode 错误代码
     * @param message   消息
     * @return
     */
    public static <T> BaseResponse<T> error(T data, ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), data, message);
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse error(int code, String message) {
        return new BaseResponse(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message) {
        return new BaseResponse(errorCode.getCode(), null, message);
    }
}
