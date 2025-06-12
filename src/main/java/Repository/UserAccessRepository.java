package Repository;

import Entity.UserAccess;
import JPAUtil.JPAUtil;
import Validation.DIALOG;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class UserAccessRepository {

    public static UserAccess loginRepository(String userName, String passwordHash) {
        EntityManager em = JPAUtil.getEntityManager();
        TypedQuery<UserAccess> query;

        try {
            query = em.createQuery("SELECT u FROM UserAccess u where u.name = :usuario AND u.password = :senha", UserAccess.class);
            query.setParameter("usuario", userName);
            query.setParameter("senha", passwordHash);

            return query.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            JPAUtil.close();
        }
    }

    public static void cadastrarRepository(UserAccess usuario) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            DIALOG.exbirMensagem(null, "Usuário administrador adiconado!");

        } catch (Exception e) {
            DIALOG.exbirMensagem(null, "Ocorreu um erro ao adicionar o ADM ao banco!");
        } finally {
            em.close();
        }
    }

    public static List<UserAccess> getUserAccessRepository() {
        EntityManager em = JPAUtil.getEntityManager();
        List<UserAccess> lista = null;

        Query query;

        try {
            query = em.createQuery("SELECT a from UserAccess a");
            lista = query.getResultList();

            return lista;

        } catch (Exception e) {
            return lista;
        } finally {
            em.close();
        }
    }

    public static void deleteUserAccessRepository(String id) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            UserAccess user = em.find(UserAccess.class, id);

            em.getTransaction().begin();
            em.remove(user);
            em.getTransaction().commit();
            DIALOG.exbirMensagem(null, "Usuário removido com sucesso!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            DIALOG.exbirMensagem(null, "Ocorreu um erro ao apagar o administrador do banco!");
        } finally {
            em.close();
        }
    }

}
