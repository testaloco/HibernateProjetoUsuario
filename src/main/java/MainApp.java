import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MainApp {

    public static void main(String[] args){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
    }
}
