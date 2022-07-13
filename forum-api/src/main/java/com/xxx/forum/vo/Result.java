package com.xxx.forum.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    private int code;
    private String msg;
    private Object data;
    public static Result success(Object data){
        return new Result(200,"success",data);
    }
    public static Result error(String msg){
        return new Result(500,msg,null);
    }
    public static Result error(int code,String msg){
        return new Result(code,msg,null);
    }
}
