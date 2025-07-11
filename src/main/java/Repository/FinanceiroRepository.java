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

    private static EntityManager entityManager;

    public static void cadastrarPagamentoRepository(Payment pagamento) {
        entityManager = JPAUtil.getEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pagamento);
            entityManager.getTransaction().commit();
            DIALOG.exbirMensagem("Pagamento do " + pagamento.getCliente().getNome() + "foi realizado");

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            DIALOG.exbirMensagem("Ocorreu um erro ao adicionar o pagamento!");
        } finally {
            entityManager.close();
        }
    }

    public static List<PagamentoDTO> listarDadosPagamentoRepository(LocalDate dataAtual, LocalDate dataMenos30) {
        entityManager = JPAUtil.getEntityManager();

        List<PagamentoDTO> lista = new ArrayList<>();

        try {
            Query query;
            query = entityManager.createNativeQuery("SELECT p.data_ultimo_pagamento, c.nome_cliente, tm.valor_matricula, c.email from Pagamento as p join ClienteCadastro as c on p.id_cliente = c.ID join TipoMatricula as tm on p.id_tipo_matricula = tm.ID where data_ultimo_pagamento >= ? AND data_ultimo_pagamento <= ?;");
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
            DIALOG.exbirMensagem("Ocorreu um erro ao exibir os pagamentos");
            return lista;
        }
    }

    public static void cadastrarDespesaRepository(Despesa despesa) {
        entityManager = JPAUtil.getEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(despesa);
            entityManager.getTransaction().commit();

            DIALOG.exbirMensagem("Despesa cadastrada");

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            DIALOG.exbirMensagem("Ocorreu um erro ao adicionar uma despesa!");
        } finally {
            entityManager.close();
        }
    }

    public static List<Despesa> ListarDespesasRepository(LocalDate dataAtual, LocalDate dataMenos30) {
        entityManager = JPAUtil.getEntityManager();

        List<Despesa> listaDespesas = new ArrayList<>();
        Query query;

        try {
            query = entityManager.createNativeQuery("SELECT * from Despesa WHERE data_despesa > ? AND data_despesa < ?", Despesa.class);
            query.setParameter(1, dataMenos30);
            query.setParameter(2, dataAtual);
            listaDespesas = query.getResultList();

            return listaDespesas;

        } catch (Exception e) {
            return listaDespesas;
        } finally {
            entityManager.close();
        }
    }
}
