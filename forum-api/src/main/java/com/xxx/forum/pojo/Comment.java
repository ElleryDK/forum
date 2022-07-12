package com.xxx.forum.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Comment{
    @TableId(value = "co_id")
    private Integer id;

    /**
     * 评论者姓名
     */
    private String name;

    /**
     * 内容
     */
    private String content;

    /**
     * 是否是博主
     */
    private Boolean isAdmin;

    /**
     * 是否逻辑删除
     */
    private Boolean isDelete;

    /**
     * 博客id
     */
    private Integer blId;

    /**
     * 父节点
     */
    private Integer parentId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;



}
