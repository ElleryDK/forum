package com.xxx.forum.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 回答表
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Answer implements Serializable {

    private Integer id;

    /**
     * 回答者姓名
     */
    private String name;

    /**
     * 内容
     */
    private String content;

    /**
     * 访问量
     */
    private Integer views;

    /**
     * 赞赏量
     */
    private Integer likes;

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
