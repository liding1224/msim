package com.miygo.msim.controller.vo;

import com.miygo.common.utils.UIConstants;
import lombok.Data;

@Data
public class BaseResponse<T> {
    private Integer code;
    private String message;
    private T data;

    public static <U extends BaseResponse> U getSuccessResult(Class<U> clazz){
        try {
            U u = clazz.newInstance();
            u.setCode(UIConstants.SUCCESS_CODE);
            u.setMessage(UIConstants.SUCCESS_RESPONSE_TEXT);
            return u;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public static <U extends BaseResponse> U getFailResult(Class<U> clazz){
        try {
            U u = clazz.newInstance();
            u.setCode(UIConstants.FAIL_CODE);
            u.setMessage(UIConstants.FAIL_RESPONSE_TEXT);
            return u;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}