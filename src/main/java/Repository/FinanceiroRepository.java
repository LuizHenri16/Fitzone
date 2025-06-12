package Repository;

import DTO.PagamentoDTO;
import Entity.Despesa;
import Entity.Payment;
import JPAUtil.JPAUtil;
import Validation.DIALOG;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceiroRepository {

    public static void cadastrarPagamentoRepository(Payment pagamento) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(pagamento);
            em.getTransaction().commit();
            DIALOG.exbirMensagem(null, "Pagamento do " + pagamento.getCliente().getNome() + "foi realizado");

        } catch (Exception e) {
            em.getTransaction().rollback();
            DIALOG.exbirMensagem(null, "Ocorreu um erro ao adicionar o pagamento!");
        } finally {
            em.close();
        }
    }

    public static List<PagamentoDTO> listarDadosPagamentoRepository(LocalDate dataAtual, LocalDate dataMenos30) {
        List<PagamentoDTO> lista = new ArrayList<>();

        try (EntityManager em = JPAUtil.getEntityManager()) {
            Query query;
            query = em.createNativeQuery("SELECT p.data_ultimo_pagamento, c.nome_cliente, tm.valor_matricula, c.email from pagamento as p join cliente_cadastro as c on p.id_cliente = c.ID join tipo_matricula as tm on p.id_tipo_matricula = tm.ID where data_ultimo_pagamento >= ? AND data_ultimo_pagamento <= ?;");
            query.setParameter(1, dataMenos30);
            query.setParameter(2, dataAtual);

            List<Object[]> resultados = query.getResultList();

            for (Object[] linha : resultados) {
                PagamentoDTO dto = new PagamentoDTO();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String data = linha[0] instanceof Date ? sdf.format((Date) linha[0]) : (String) linha[0];

                dto.setDataUltimoPagamento(data);
                dto.setNomeCliente((String) linha[1]);
                dto.setValorMatricula(((BigDecimal) linha[2]).doubleValue());
                dto.setEmail((String) linha[3]);
                lista.add(dto);
            }
            return lista;

        } catch (Exception e) {
            System.out.println(e);
            DIALOG.exbirMensagem(null, "Ocorreu um erro ao exibir os pagamentos");
            return lista;
        }
    }

    public static void cadastrarDespesaRepository(Despesa despesa) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(despesa);
            em.getTransaction().commit();
            DIALOG.exbirMensagem(null, "Despesa cadastrada");

        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println(e);
            DIALOG.exbirMensagem(null, "Ocorreu um erro ao adicionar uma despesa!");
        } finally {
            em.close();
        }
    }

    public static List<Despesa> ListarDespesasRepository(LocalDate dataAtual, LocalDate dataMenos30) {
        List<Despesa> lista = new ArrayList<>();
        EntityManager em = JPAUtil.getEntityManager();
        Query query;

        try {
            query = em.createNativeQuery("SELECT * from Despesa WHERE data_despesa > ? AND data_despesa < ?", Despesa.class);
            query.setParameter(1, dataMenos30);
            query.setParameter(2, dataAtual);
            lista = query.getResultList();

            return lista;

        } catch (Exception e) {
            System.out.println(e);
            return lista;
        } finally {
            em.close();
        }
    }
}
