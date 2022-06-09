package com.xxx.forum.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Blog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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
    private Integer tyId;

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


}
