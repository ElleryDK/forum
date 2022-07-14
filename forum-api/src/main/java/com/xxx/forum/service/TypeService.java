package com.xxx.forum.service;

import com.xxx.forum.pojo.Type;

import java.util.List;

/**
 * <p>
 * 分类表 服务类
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
public interface TypeService {

    List<Type> getAllTypes();

    Type updateType(int id, String name);

    Type addType(String name);

    Type deleteType(int id);
}
