package com.xxx.forum.service.impl;


import com.xxx.forum.pojo.Type;
import com.xxx.forum.mapper.TypeMapper;
import com.xxx.forum.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 分类表 服务实现类
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public List<Type> getAllTypes() {
        List<Type> types = typeMapper.getAllTypes();
        return types;
    }

    @Override
    public Type updateType(int id, String name) {
        Type type = new Type();
        type.setTyId(id);
        type.setName(name);
        type.setUpdateTime(LocalDateTime.now());
        typeMapper.updateType(type);
        return type;
    }

    @Override
    public Type addType(String name) {
        Type type = new Type();
        type.setName(name);
        type.setCreateTime(LocalDateTime.now());
        type.setUpdateTime(LocalDateTime.now());
        int id = typeMapper.addType(type);
        return type;
    }

    @Override
    public Type deleteType(int id) {
        Type type = typeMapper.getTypeById(id);
        if(null==type){
            return null;
        }
        typeMapper.deleteTypeById(id);
        return type;
    }
}
