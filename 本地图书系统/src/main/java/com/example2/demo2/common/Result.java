package com.example2.demo2.common;

/**
 * 夏辰义
 * 2026/8/1121:44
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data){
        Result<T> tResult = new Result<>();
        tResult.setCode(200);
        tResult.setMsg("success");
        tResult.setData(data);
        return tResult;
    }

    public static <T> Result<T> success(){
        Result<T> tResult = new Result<>();
        tResult.setCode(200);
        tResult.setMsg("success");
        tResult.setData(null);
        return tResult;
    }

    public static <T> Result<T> error(String msg){
        Result<T> tResult = new Result<>();
        tResult.setCode(500);
        tResult.setMsg(msg);
        return tResult;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
