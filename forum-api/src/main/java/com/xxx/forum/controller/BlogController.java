package com.xxx.forum.controller;


import com.xxx.forum.service.BlogService;
import com.xxx.forum.vo.BlogVo;
import com.xxx.forum.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 文章表 前端控制器
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@RestController
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping("tag")
    public Result getTagBlogs(@RequestParam("id") int id,@RequestParam("page") int page){
        int start = (page-1)*10;
        List<BlogVo> blogVos = blogService.selectBlogsByTag(id,start);
        return Result.success(blogVos);
    }

}

