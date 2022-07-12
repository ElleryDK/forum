package com.xxx.forum.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tag{
    @TableId(value = "ta_id")
    private Integer taId;
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
