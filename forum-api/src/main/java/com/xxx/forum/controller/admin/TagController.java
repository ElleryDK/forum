package com.xxx.forum.controller.admin;


import com.xxx.forum.pojo.Tag;
import com.xxx.forum.service.TagService;
import com.xxx.forum.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * <p>
 * 标签表 前端控制器
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@Controller
@RequestMapping("tag")
public class TagController {
    @Autowired
    private TagService tagService;
    @GetMapping("all")
    public Result getAllTags(){
        List<Tag> tags = tagService.getAllTags();
        return Result.success(tags);
    }
    @PostMapping("update")
    public Result updateTag(@RequestParam("id") int id,@RequestParam("name") String name){
        Tag tag = tagService.updateTag(id,name);
        return Result.success(tag);
    }
    @PostMapping("add")
    public Result addTag(@RequestParam("name") String name){
        Tag tag = tagService.addTag(name);
        return Result.success(tag);
    }
    @GetMapping("delete")
    public Result deleteTag(@PathParam("id") int id){
        Tag tag = tagService.deleteTag(id);
        return Result.success(tag);
    }

}

