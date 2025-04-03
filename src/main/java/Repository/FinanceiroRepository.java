package Repository;

import Entity.Despesa;
import Entity.UserAccess;
import JPAUtil.JPAUtil;
import Validation.DIALOG;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class FinanceiroRepository {

    static EntityManager em;

    public static void cadastrarPagamentoRepository() {

    }

    public static void listarDadosPagamentoRepository() {

    }

    public static void cadastrarDespesaRepository(Despesa despesa) {
        em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(despesa);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println(e);
            DIALOG.exbirMensagem(null, "Ocorreu um erro ao adicionar uma despesa!");
        } finally {
            em.close();
        }
    }

    public static List<Despesa> ListarDespesasRepository() {
        List<Despesa> lista = null;
        em = JPAUtil.getEntityManager();
        Query query;

        try {
            query = em.createQuery("SELECT d from Despesa d");
            lista = query.getResultList();

            return lista;

        } catch (Exception e) {
            return lista;
        } finally {
            em.close();
        }

    }

    public static void valorTotalDespesa() {

    }

    public static void valorTotalReceita() {

    }



}
