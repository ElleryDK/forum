package com.xxx.forum.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.xxx.forum.pojo.Author;
import com.xxx.forum.pojo.Tag;
import com.xxx.forum.pojo.Type;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlogVo {
    private Integer blId;
    private String title;
    private String content;
    private String outline;
    private Integer recommend;
    private Integer commentable;
    private Integer published;
    private Integer views;
    //private Integer tyId;
    private Type type;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    //private Integer auId;
    private Author author;
    private List<Tag> tags;

}
