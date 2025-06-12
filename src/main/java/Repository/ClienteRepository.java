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

    public static void postCustomerRepository(Cliente cliente) {

        EntityManager em = JPAUtil.getEntityManager();

        try {
            em = JPAUtil.getEntityManager();
            em.getTransaction().begin();
            em.persist(cliente);
            em.flush();

            if (cliente.getContato() != null) {
                cliente.getContato().setCliente(cliente);
            }
            if (cliente.getEndereco() != null) {
                cliente.getEndereco().setCliente(cliente);
            }
            if (cliente.getInfoComplement() != null) {
                cliente.getInfoComplement().setCliente(cliente);
            }

            em.persist(cliente.getContato());
            em.persist(cliente.getEndereco());
            em.persist(cliente.getInfoComplement());

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            DIALOG.exbirMensagem(null, "Ocorreu um erro ao adicionar um cliente");
        }
    }

    public static void updateCustomerRepository(Cliente cliente) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
            DIALOG.exbirMensagem(null, "Edição realizada com sucesso!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            DIALOG.exbirMensagem(null, "Ocorreu um erro ao editar as informações do cliente.");
        } finally {
            em.close();
        }
    }

    public static void deleteCustomerRepository(Cliente cliente) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Cliente clienteGerenciado = em.merge(cliente);
            em.remove(clienteGerenciado);
            em.getTransaction().commit();
            DIALOG.exbirMensagem(null, "Cliente removido com sucesso!");

        } catch (Exception e) {
            System.out.println(e);
            DIALOG.exbirMensagem(null, "Não foi possivel excluir o cliente");
        } finally {
            em.close();
        }
    }

    public static List<Cliente> getCustomersRepository() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Cliente> listaClientes = null;

        Query query;

        try {
            query = em.createQuery("SELECT c FROM Cliente c LEFT JOIN FETCH c.contato LEFT JOIN FETCH c.endereco LEFT JOIN FETCH c.infoComplement");
            listaClientes = query.getResultList();

            return listaClientes;
        } catch (Exception e) {
            DIALOG.exbirMensagem(null, "Erro ao buscar os clientes no banco");
            System.out.println(e);
        }

        if (listaClientes == null) {
            listaClientes = new ArrayList<>();
        }
        return listaClientes;
    }

    public static Cliente getCustomerRepository(String idCliente) {
        EntityManager em = JPAUtil.getEntityManager();
        em = JPAUtil.getEntityManager();
        Cliente cliente = null;

        try {
            cliente = em.find(Cliente.class, idCliente);
            return cliente;
        } catch (Exception e) {
            DIALOG.exbirMensagem(null, "Erro ao buscar as informações do cliente");
        } finally {
            JPAUtil.close();
        }
        return cliente;
    }

    public static LicenseType listarMatriculasRepository(String matricula) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            TypedQuery<LicenseType> query = em.createQuery(
                    "SELECT t FROM LicenseType t where t.licenseType = :matricula", LicenseType.class
            );
            query.setParameter("matricula", matricula);
            LicenseType newmatricula = query.getSingleResult();

            return newmatricula;
        } catch (NoResultException e) {
            DIALOG.exbirMensagem(null, "Matricula não encontrada na base de dados");
            return null;
        }
    }

    public static Integer getCountRegisteredCustomersRepository() {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            Query consulta = em.createNativeQuery("SELECT COUNT(*) FROM cliente_cadastro");

            Number resultado = (Number) consulta.getSingleResult();
            return resultado.intValue();

        } catch (Exception e) {
            System.out.println(e);
            DIALOG.exbirMensagem(null, "Não foi possivel contar alunos cadastrados.");
        } finally {
            em.close();
        }
        return null;
    }

    public static Integer getCountActiveCustomersRepository() {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            Query consulta = em.createNativeQuery("SELECT COUNT(*) FROM cliente_cadastro where status = 'Ativo'");

            Number resultado = (Number) consulta.getSingleResult();
            return resultado.intValue();

        } catch (Exception e) {
            DIALOG.exbirMensagem(null, "Não foi possivel contar alunos ativos.");
        } finally {
            em.close();
        }
        return null;
    }

    public static List<AniversarianteDTO> getBirthdayCustomerRepository() {
        EntityManager em = JPAUtil.getEntityManager();
        List<AniversarianteDTO> listaAniversariantes = new ArrayList<>();

        try {
            Query consulta = em.createNativeQuery("SELECT nome_cliente FROM cliente_cadastro WHERE DAY(data_nascimento) = DAY(CURDATE()) AND MONTH(data_nascimento) = MONTH(CURDATE())");
            List<Object> objects = consulta.getResultList();

            for (Object obj : objects) {
                AniversarianteDTO aniversariante = new AniversarianteDTO();

              
                aniversariante.setNome((String) obj);
                listaAniversariantes.add(aniversariante);
            }

            return listaAniversariantes;
        } catch (Exception e) {
            System.out.println(e);
            DIALOG.exbirMensagem(null, "Não foi possível retornar os aniversariantes.");
        }
        return listaAniversariantes;
    }
}
