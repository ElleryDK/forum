package com.xxx.forum.vo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PageResult {
    private int code;
    private String msg;
    private int total;
    private Object data;
    public static PageResult success(int total, Object data){
        return new PageResult(200,"success",total,data);
    }
}
