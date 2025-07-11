package Repository;

import DTO.AniversarianteDTO;
import Entity.*;
import JPAUtil.JPAUtil;
import Validation.DIALOG;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private static EntityManager entityManager;

    public static void postCustomerRepository(Cliente cliente) {

        entityManager = JPAUtil.getEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(cliente);
            entityManager.flush();

            if (cliente.getContato() != null) {
                cliente.getContato().setCliente(cliente);
            }
            if (cliente.getEndereco() != null) {
                cliente.getEndereco().setCliente(cliente);
            }
            if (cliente.getInfoComplement() != null) {
                cliente.getInfoComplement().setCliente(cliente);
            }

            entityManager.persist(cliente.getContato());
            entityManager.persist(cliente.getEndereco());
            entityManager.persist(cliente.getInfoComplement());

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            DIALOG.exbirMensagem("Ocorreu um erro ao adicionar um cliente");
        }
    }

    public static void updateCustomerRepository(Cliente cliente) {
        entityManager = JPAUtil.getEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.merge(cliente);
            entityManager.getTransaction().commit();
            DIALOG.exbirMensagem("Edição realizada com sucesso!");

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            DIALOG.exbirMensagem("Ocorreu um erro ao editar as informações do cliente.");
        } finally {
            entityManager.close();
        }
    }

    public static void deleteCustomerRepository(Cliente cliente) {
        entityManager = JPAUtil.getEntityManager();

        try {
            entityManager.getTransaction().begin();
            Cliente clienteGerenciado = entityManager.merge(cliente);

            entityManager.remove(clienteGerenciado);
            entityManager.getTransaction().commit();

            DIALOG.exbirMensagem("Cliente removido com sucesso!");

        } catch (Exception e) {
            DIALOG.exbirMensagem("Não foi possivel excluir o cliente");
        } finally {
            entityManager.close();
        }
    }

    public static List<Cliente> getCustomersRepository() {
        entityManager = JPAUtil.getEntityManager();
        List<Cliente> listaClientes = new ArrayList<>();

        Query query;

        try {
            query = entityManager.createQuery("SELECT c FROM Cliente c LEFT JOIN FETCH c.contato LEFT JOIN FETCH c.endereco LEFT JOIN FETCH c.infoComplement");
            listaClientes = query.getResultList();

            return listaClientes;
        } catch (Exception e) {
            DIALOG.exbirMensagem("Erro ao buscar os clientes no banco");
        }
        return listaClientes;
    }

    public static Cliente getCustomerRepository(String idCliente) {
        entityManager = JPAUtil.getEntityManager();

        try {
            return entityManager.find(Cliente.class, idCliente);
        } catch (Exception e) {
            DIALOG.exbirMensagem("Erro ao buscar as informações do cliente");
        } finally {
            JPAUtil.close();
        }
        return null;
    }

    public static LicenseType getRegistryRepository(String matricula) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            TypedQuery<LicenseType> query = em.createQuery(
                    "SELECT t FROM LicenseType t where t.licenseType = :matricula", LicenseType.class
            );

            query.setParameter("matricula", matricula);
            return query.getSingleResult();

        } catch (NoResultException e) {
            DIALOG.exbirMensagem("Matricula não encontrada na base de dados");
            return null;
        }
    }

    public static Integer getCountRegisteredCustomersRepository() {
        entityManager = JPAUtil.getEntityManager();

        try {
            Query consulta = entityManager.createNativeQuery("SELECT COUNT(*) FROM ClienteCadastro");

            Number resultado = (Number) consulta.getSingleResult();
            return resultado.intValue();

        } catch (Exception e) {
            DIALOG.exbirMensagem("Não foi possivel contar alunos cadastrados.");
        } finally {
            entityManager.close();
        }
        return null;
    }

    public static Integer getCountActiveCustomersRepository() {
        entityManager = JPAUtil.getEntityManager();

        try {
            Query consulta = entityManager.createNativeQuery("SELECT COUNT(*) FROM ClienteCadastro where status = 'Ativo'");

            Number resultado = (Number) consulta.getSingleResult();
            return resultado.intValue();

        } catch (Exception e) {
            DIALOG.exbirMensagem("Não foi possivel contar alunos ativos.");
        } finally {
            entityManager.close();
        }
        return null;
    }

    public static List<AniversarianteDTO> getBirthdayCustomerRepository() {
        entityManager = JPAUtil.getEntityManager();
        List<AniversarianteDTO> listaAniversariantes = new ArrayList<>();

        try {
            Query consulta = entityManager.createNativeQuery("SELECT nome_cliente FROM ClienteCadastro WHERE DAY(data_nascimento) = DAY(CURDATE()) AND MONTH(data_nascimento) = MONTH(CURDATE())");
            List<Object> objects = consulta.getResultList();

            for (Object obj : objects) {
                AniversarianteDTO aniversariante = new AniversarianteDTO();

                aniversariante.setNome((String) obj);
                listaAniversariantes.add(aniversariante);
            }

            return listaAniversariantes;
        } catch (Exception e) {
            DIALOG.exbirMensagem("Não foi possível retornar os aniversariantes.");
        }
        return listaAniversariantes;
    }
}
