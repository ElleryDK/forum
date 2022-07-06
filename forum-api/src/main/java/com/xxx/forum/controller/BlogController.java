package com.xxx.forum.controller;


import com.xxx.forum.mapper.BlogMapper;
import com.xxx.forum.param.PageParam;
import com.xxx.forum.pojo.Blog;
import com.xxx.forum.service.BlogService;
import com.xxx.forum.vo.PageResult;
import com.xxx.forum.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 文章表 前端控制器
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping("type/{id}")
    public Result selectBlogByType(@PathVariable("id") int id,@RequestParam("currentPage")int currentPage,@RequestParam("pageSize") int pageSize){
        PageParam pageParam = new PageParam(currentPage,pageSize);
        PageResult pageResult = blogService.selectBlogsByType(id,pageParam);
        return Result.success(pageResult);
    }

}

