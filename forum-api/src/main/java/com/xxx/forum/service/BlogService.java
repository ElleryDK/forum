package com.xxx.forum.service;

import com.xxx.forum.param.PageParam;
import com.xxx.forum.pojo.Blog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.forum.vo.PageResult;

/**
 * <p>
 * 文章表 服务类
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
public interface BlogService extends IService<Blog> {

    PageResult selectBlogsByType(int id, PageParam pageParam);
}
