package com.xxx.forum.service;

import com.xxx.forum.pojo.Blog;
import com.xxx.forum.vo.BlogVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 文章表 服务类
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
public interface BlogService {



    List<BlogVo> getTypeBlogs(@Param("id") int id,@Param("start") int start);
    List<BlogVo> getTagBlogs(@Param("id") int id,@Param("start") int start);

    List<BlogVo> getHotBlogs();

    BlogVo viewBlog(int id);

    int addBlog(Blog blog);

    void updateBlog(Blog blog);
}
