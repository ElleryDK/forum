package com.xxx.forum.mapper;

import com.xxx.forum.pojo.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 标签表 Mapper 接口
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
public interface TagMapper {
    @Select("select * from t_tag where ta_id = #{id}")
    Tag selectTag(int id);
    void deleteBlogTags(List<Integer> id);
    void insertBlogTags(@Param("blId")Integer blId,@Param("tags") List<Integer> tags);

    List<Tag> getAllTags();

    Tag getTagById(int id);

    void updateTag(Tag tag);

    int addTag(Tag tag);

    void deleteTagById(int id);
}
