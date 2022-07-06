package com.xxx.forum.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xxx.forum.param.PageParam;
import com.xxx.forum.pojo.Blog;
import com.xxx.forum.mapper.BlogMapper;
import com.xxx.forum.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.forum.vo.BlogVo;
import com.xxx.forum.vo.PageResult;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public PageResult selectBlogsByType(int id, PageParam pageParam) {
        int start = (pageParam.getCurrentPage()-1)* pageParam.getPageSize();
        List<BlogVo> blogVos = blogMapper.selectBlogsByType(id,start,pageParam.getPageSize());
        int total = blogMapper.selectBlogCountByType(id);
        return PageResult.success(total,blogVos);
    }

}
