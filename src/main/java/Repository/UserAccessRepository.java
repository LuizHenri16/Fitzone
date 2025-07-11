package Repository;

import Entity.UserAccess;
import JPAUtil.JPAUtil;
import Validation.DIALOG;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class UserAccessRepository {

    private static EntityManager entityManager;

    public static UserAccess loginRepository(String userName, String passwordHash) {
        entityManager = JPAUtil.getEntityManager();
        TypedQuery<UserAccess> query;

        try {
            query = entityManager.createQuery("SELECT u FROM UserAccess u where u.name = :usuario AND u.password = :senha", UserAccess.class);
            query.setParameter("usuario", userName);
            query.setParameter("senha", passwordHash);

            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            JPAUtil.close();
        }
    }

    public static void cadastrarRepository(UserAccess usuario) {
        entityManager = JPAUtil.getEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(usuario);
            entityManager.getTransaction().commit();
            DIALOG.exbirMensagem("Usuário administrador adiconado!");

        } catch (Exception e) {
            DIALOG.exbirMensagem("Ocorreu um erro ao adicionar o ADM ao banco!");
        } finally {
            entityManager.close();
        }
    }

    public static List<UserAccess> getUserAccessRepository() {
        entityManager = JPAUtil.getEntityManager();
        List<UserAccess> lista = null;

        Query query;

        try {
            query = entityManager.createQuery("SELECT a from UserAccess a");
            lista = query.getResultList();

            return lista;

        } catch (Exception e) {
            return lista;
        } finally {
            entityManager.close();
        }
    }

    public static void deleteUserAccessRepository(String id) {
        entityManager = JPAUtil.getEntityManager();

        try {
            UserAccess user = entityManager.find(UserAccess.class, id);

            entityManager.getTransaction().begin();
            entityManager.remove(user);
            entityManager.getTransaction().commit();
            DIALOG.exbirMensagem("Usuário removido com sucesso!");

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            DIALOG.exbirMensagem("Ocorreu um erro ao apagar o administrador do banco!");
        } finally {
            entityManager.close();
        }
    }
}
