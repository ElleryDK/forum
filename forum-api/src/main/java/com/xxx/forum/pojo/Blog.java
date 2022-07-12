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
public class Blog{
    private Integer blId;
    private String title;
    private String content;
    private String outline;
    private Integer recommend;
    private Integer commentable;
    private Integer published;
    private Integer views;
    private Integer tyId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Integer auId;
}
