import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Created by lzx on 2019/10/24.
 */
public class StudentDAOTest {

    @Test
    public void persist(){

//1.获得实体管理类

        EntityManager manager = JPAUtils.getEntityManger();

//2、获取事物管理器

        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

//3、创建实体对象

        Student s =new Student();

        s.setStuName("张三");

        s.setStuAge(18);

        s.setStuPassword("zj");

//4、保存到数据库

        manager.persist(s);

//5、提交事物

        transaction.commit();

//6、关闭资源

        manager.close();

    }

}
