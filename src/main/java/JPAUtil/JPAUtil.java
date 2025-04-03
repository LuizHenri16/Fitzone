package JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    
    private static final String PERSISTENCE_UNIT = "fitzone-PU";
    
    static EntityManager em;
    static EntityManagerFactory emFactory;
    
    
    public static EntityManager getEntityManager() {
        if(emFactory == null || !emFactory.isOpen()) {
            emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        
        if(em == null || !em.isOpen()) {
             em = emFactory.createEntityManager();
        }
        return em;
    }
    
    public static void close() {
        if (em.isOpen() && em != null) {
            em.close();
            emFactory.close();
        }
    }
}
