import com.xxx.forum.ForumApplication;
import com.xxx.forum.mapper.TypeMapper;
import com.xxx.forum.pojo.Type;
import jdk.nashorn.internal.codegen.TypeMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ForumApplication.class)
public class TestTypeMapper {
    @Autowired
    private TypeMapper typeMapper;
    @Test
    public void addType(){
        String name = "elle";
        Type type = new Type();
        type.setName(name);
        type.setCreateTime(LocalDateTime.now());
        type.setUpdateTime(LocalDateTime.now());
        int id = typeMapper.addType(type);
        System.out.println(id);
    }
    @Test
    public void getTypes(){
        List<Type> types = typeMapper.getAllTypes();
        types.forEach(System.out::println);
    }
}
