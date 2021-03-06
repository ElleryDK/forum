import com.xxx.forum.ForumApplication;
import com.xxx.forum.mapper.BlogMapper;
import com.xxx.forum.pojo.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ForumApplication.class)
public class TestBlogMapper {
    @Autowired
    private BlogMapper blogMapper;
    @Test
    public void testTagBlogs(){
        List<Tag> tags = blogMapper.getTags(127);
        tags.forEach(System.out::println);
    }
}
