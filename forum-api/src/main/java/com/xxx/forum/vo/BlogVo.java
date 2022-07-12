package com.xxx.forum.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.xxx.forum.pojo.Tag;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlogVo {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String author;
    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 简介
     */
    private String outline;

    /**
     * 是否置顶
     */
    private Boolean weight;

    /**
     * 是否发布
     */
    private Boolean published;

    /**
     * 访问量
     */
    private Integer views;

    /**
     * 赞赏量
     */
    private Integer likes;

    /**
     * 类型id
     */
    private String type;

    /**
     * 状态（1.启用 2.禁用）
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    private List<Tag> tags;

}
