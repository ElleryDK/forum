package com.xxx.forum.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Type implements Serializable {

    private Integer tyId;

    /**
     * 类型名
     */
    private String name;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
