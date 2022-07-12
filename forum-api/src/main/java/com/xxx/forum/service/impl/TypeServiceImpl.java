package com.xxx.forum.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xxx.forum.pojo.Type;
import com.xxx.forum.mapper.TypeMapper;
import com.xxx.forum.service.TypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public List<Type> getAllTypes() {
        LambdaQueryWrapper<Type> wrapper = new LambdaQueryWrapper<>();
        wrapper.orderByDesc(Type::getUpdateTime);
        List<Type> types = typeMapper.selectList(wrapper);
        return types;
    }

    @Override
    public Type updateType(int id, String name) {
        Type type = new Type();
        type.setTyId(id);
        type.setName(name);
        type.setUpdateTime(LocalDateTime.now());
        typeMapper.updateById(type);
        return type;
    }

    @Override
    public Type addType(String name) {
        Type type = new Type();
        type.setName(name);
        type.setCreateTime(LocalDateTime.now());
        type.setUpdateTime(LocalDateTime.now());
        typeMapper.insert(type);
        return type;
    }

    @Override
    public Type deleteType(int id) {
        Type type = typeMapper.selectById(id);
        typeMapper.deleteById(id);
        return type;
    }
}
