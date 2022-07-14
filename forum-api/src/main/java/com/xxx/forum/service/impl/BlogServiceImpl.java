package com.xxx.forum.service.impl;


import com.xxx.forum.pojo.Blog;
import com.xxx.forum.mapper.BlogMapper;
import com.xxx.forum.service.BlogService;

import com.xxx.forum.vo.BlogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public List<BlogVo> getTypeBlogs(int id, int start) {
        List<BlogVo> blogVos = blogMapper.getTypeBlogs(id,start);
        return blogVos;
    }

    @Override
    public List<BlogVo> getTagBlogs(int id, int start) {
        List<BlogVo> blogVos = blogMapper.getTagBlogs(id,start);
        return blogVos;
    }

    @Override
    public List<BlogVo> getHotBlogs() {
        List<BlogVo> blogVos = blogMapper.getHotBlogs();
        return blogVos;
    }

    @Override
    public BlogVo viewBlog(int id) {
        BlogVo blogVo = blogMapper.viewBlog(id);
        return blogVo;
    }

    @Override
    public int addBlog(Blog blog) {
        return 0;
    }

    @Override
    public void updateBlog(Blog blog) {

    }
}
