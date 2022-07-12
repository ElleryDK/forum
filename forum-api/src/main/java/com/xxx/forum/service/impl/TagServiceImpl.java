package com.xxx.forum.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xxx.forum.pojo.Tag;
import com.xxx.forum.mapper.TagMapper;
import com.xxx.forum.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {
    @Autowired
    private TagMapper tagMapper;
    @Override
    public List<Tag> getAllTags() {
        LambdaQueryWrapper<Tag> wrapper = new LambdaQueryWrapper<>();
        wrapper.orderByDesc(Tag::getUpdateTime);
        List<Tag> tags = tagMapper.selectList(wrapper);
        return tags;
    }

    @Override
    public Tag updateTag(int id,String name) {
        Tag tag = new Tag();
        tag.setTaId(id);
        tag.setName(name);
        tag.setUpdateTime(LocalDateTime.now());
        tagMapper.updateById(tag);
        return tag;
    }

    @Override
    public Tag addTag(String name) {
        Tag tag = new Tag();
        tag.setName(name);
        tag.setCreateTime(LocalDateTime.now());
        tag.setUpdateTime(LocalDateTime.now());
        tagMapper.insert(tag);
        return tag;
    }

    @Override
    public Tag deleteTag(int id) {
        Tag tag = tagMapper.selectById(id);
        tagMapper.deleteById(id);
        return tag;
    }
}
