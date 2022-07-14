package com.xxx.forum.mapper;

import com.xxx.forum.pojo.Type;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 分类表 Mapper 接口
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
public interface TypeMapper {

    List<Type> getAllTypes();

    void updateType(Type type);

    int addType(Type type);

    Type getTypeById(int id);

    void deleteTypeById(int id);

    List<Integer> getTypeCount();
}
