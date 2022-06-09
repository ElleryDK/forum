package com.xxx.forum.mapper;

import com.xxx.forum.pojo.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 文章表 Mapper 接口
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
public interface BlogMapper extends BaseMapper<Blog> {
    Blog getFullBlogById(int id);
}
