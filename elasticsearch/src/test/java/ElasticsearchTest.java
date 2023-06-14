import daydayup.elasticsearch.Application;
import daydayup.elasticsearch.component.Ecs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.IndexOperations;
import org.springframework.data.elasticsearch.core.document.Document;

/**
 * @author alexchen
 */
@SpringBootTest(classes = Application.class)
public class ElasticsearchTest {

    @Autowired
    private ElasticsearchRestTemplate template;

    @Test
    void createIndex() {
        // 获取索引操作对象
        IndexOperations indexOperations = template.indexOps(Ecs.class);

        // 是否存在，存在则删除
        if (indexOperations.exists()) {
            indexOperations.delete();
        }

        // 创建索引
        indexOperations.create();

        // createMapping 根据实体类获取映射关系
        // putMapping 把映射关系添加到索引中
        Document mapping = indexOperations.createMapping(Ecs.class);
        indexOperations.putMapping(mapping);
    }

    @Test
    void deleteIndex() {
        IndexOperations indexOperations = template.indexOps(Ecs.class);
        boolean delete = indexOperations.delete();
        System.out.println(delete);
    }

    @Test
    void insert(){
        Ecs ecs = new Ecs(1L, "vm-001", "4c8g云服务器","北京这是一个有趣的责任有限公司");
        Ecs save = template.save(ecs);
        System.out.println(save);
    }
}
