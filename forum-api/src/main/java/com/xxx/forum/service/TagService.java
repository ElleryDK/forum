package com.xxx.forum.service;

import com.xxx.forum.pojo.Tag;

import java.util.List;

/**
 * <p>
 * 标签表 服务类
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
public interface TagService{

    List<Tag> getAllTags();

    Tag updateTag(int id,String name);

    Tag addTag(String name);

    Tag deleteTag(int id);
}
