import com.xxx.forum.ForumApplication;
import com.xxx.forum.mapper.TagMapper;
import com.xxx.forum.pojo.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ForumApplication.class)
public class TestTagMapper {
    @Autowired
    private TagMapper tagMapper;
    @Test
    public void testAddBlogTags(){
        int blId = 1;
        List<Integer> tags = Arrays.asList(1,2,3);
        tagMapper.insertBlogTags(blId,tags);
    }
    @Test
    public void testGetAllTags(){
        List<Tag> tags = tagMapper.getAllTags();
        tags.forEach(System.out::println);
    }
}
