package com.xxx.forum.controller.admin;


import com.xxx.forum.pojo.Tag;
import com.xxx.forum.pojo.Type;
import com.xxx.forum.service.TypeService;
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
 * 分类表 前端控制器
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@Controller
@RequestMapping("type")
public class TypeController {
    @Autowired
    private TypeService typeService;
    @GetMapping("all")
    public Result getAllTags(){
        List<Type> types = typeService.getAllTypes();
        return Result.success(types);
    }
    @PostMapping("update")
    public Result updateTag(@RequestParam("id") int id, @RequestParam("name") String name){
        Type type = typeService.updateType(id,name);
        return Result.success(type);
    }
    @PostMapping("add")
    public Result addTag(@RequestParam("name") String name){
        Type type = typeService.addType(name);
        return Result.success(type);
    }
    @GetMapping("delete")
    public Result deleteTag(@PathParam("id") int id){
        Type type = typeService.deleteType(id);
        return Result.success(type);
    }

}

