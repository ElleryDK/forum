package com.xxx.forum.mapper;

import com.xxx.forum.pojo.Tag;
import com.xxx.forum.vo.BlogVo;
import java.util.List;

/**
 * <p>
 * 文章表 Mapper 接口
 * </p>
 *
 * @author ellery
 * @since 2022-05-31
 */
public interface BlogMapper {
    List<BlogVo> getTagBlogs(int id,int start);
    List<BlogVo> getTypeBlogs(int id,int start);
    List<BlogVo> getHotBlogs();

    BlogVo viewBlog(int id);

    List<Tag> getTags(int id);
}
