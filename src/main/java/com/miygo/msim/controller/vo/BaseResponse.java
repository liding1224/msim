package com.miygo.msim.controller.vo;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private static final int SUCCESS_CODE = 0;
    private static final String SUCCESS_TEXT = "请求成功";
    private static final int FAIL_CODE = 1;
    private static final String FAIL_TEXT = "请求失败";

    private Integer code;
    private String message;
    private T data;

    public static <U extends BaseResponse> U getSuccessResult(Class<U> clazz){
        try {
            U u = clazz.newInstance();
            u.setCode(BaseResponse.SUCCESS_CODE);
            u.setMessage(BaseResponse.SUCCESS_TEXT);
            return u;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public static <U extends BaseResponse> U getFailResult(Class<U> clazz){
        try {
            U u = clazz.newInstance();
            u.setCode(BaseResponse.FAIL_CODE);
            u.setMessage(BaseResponse.FAIL_TEXT);
            return u;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }






































}
