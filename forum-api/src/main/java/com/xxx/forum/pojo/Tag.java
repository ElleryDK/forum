package com.xxx.forum.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * <p>
 * 标签表
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tag{
    @TableId(value = "ta_id")
    private Integer id;

    /**
     * 标签名称
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
