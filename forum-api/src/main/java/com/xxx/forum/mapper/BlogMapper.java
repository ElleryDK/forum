package com.xxx.forum.mapper;

import com.xxx.forum.pojo.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.forum.vo.BlogVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * <p>
 * 文章表 Mapper 接口
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
public interface BlogMapper extends BaseMapper<Blog> {

    List<BlogVo> selectBlogsByType(@Param("id") int id, @Param("start") int start,@Param("pageSize") int pageSize);

    int selectBlogCountByType(@Param("id") int id);
}
