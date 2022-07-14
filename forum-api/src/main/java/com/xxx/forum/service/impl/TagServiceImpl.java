package com.xxx.forum.service.impl;

import com.xxx.forum.pojo.Tag;
import com.xxx.forum.mapper.TagMapper;
import com.xxx.forum.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagMapper tagMapper;
    @Override
    public List<Tag> getAllTags() {
        List<Tag> tags = tagMapper.getAllTags();
        return tags;
    }

    @Override
    public Tag updateTag(int id,String name) {
        Tag oldTag = tagMapper.getTagById(id);
        if(null == oldTag){
            return null;
        }
        Tag tag = new Tag();
        tag.setTaId(id);
        tag.setName(name);
        tag.setCreateTime(LocalDateTime.now());
        tagMapper.updateTag(tag);
        return tag;
    }

    @Override
    public Tag addTag(String name) {
        Tag tag = new Tag();
        tag.setName(name);
        tag.setCreateTime(LocalDateTime.now());
        tag.setUpdateTime(LocalDateTime.now());
        int id = tagMapper.addTag(tag);
        tag.setTaId(id);
        return tag;
    }

    @Override
    public Tag deleteTag(int id) {
        Tag tag = tagMapper.getTagById(id);
        if(null == tag){
            return null;
        }
        tagMapper.deleteTagById(id);
        return tag;
    }
}
