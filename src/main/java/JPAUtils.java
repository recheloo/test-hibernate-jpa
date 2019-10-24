import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by lzx on 2019/10/24.
 */

public class JPAUtils {

    public static EntityManagerFactory emf = createEntityManagerFactory();

    private static EntityManagerFactory createEntityManagerFactory(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-jpa");

        return emf;

    }

    public static EntityManager getEntityManger(){

        EntityManager entityManager = emf.createEntityManager();

        return entityManager;

    }
}
