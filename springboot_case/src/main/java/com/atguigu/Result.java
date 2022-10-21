package com.atguigu;

import java.io.Serializable;

public class Result implements Serializable {
    private boolean status;
    private String msg;
    private Object data;

    public static Result ok(Object data){
        Result result = new Result();
        result.setStatus(true);
        result.setData(data);
        return  result ;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setStatus(false);
        result.setMsg(msg);
        return  result ;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
