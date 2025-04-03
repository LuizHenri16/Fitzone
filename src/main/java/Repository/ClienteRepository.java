package Repository;

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

    static EntityManager em = JPAUtil.getEntityManager();

    public static void cadastrarRepository(Cliente cliente) {

        try {
            em = JPAUtil.getEntityManager();
            em.getTransaction().begin();
            em.persist(cliente);
            em.flush(); // O flush permite gerar o id do cliente antes de levar ao banco de dados
                        // Permitindo depois fazer a comunicação com as tabelas auxiliares, levando o id para a coluna que os liga ao cliente.
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
        }catch (Exception e) {
            em.getTransaction().rollback();
            DIALOG.exbirMensagem(null, "Ocorreu um erro ao adicionar um cliente");
        }
    }

    public static void editarRepository(Cliente cliente) {
        em = JPAUtil.getEntityManager();

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

    public static void excluirRepository(Cliente cliente) {
        try {

            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
            DIALOG.exbirMensagem(null, "Cliente removido com sucesso!");

        } catch (Exception e) {
            DIALOG.exbirMensagem(null, "Não foi possivel excluir o cliente");
        } finally {
            em.close();
        }
    }

    public static List<Cliente> listarClientes() {
        List<Cliente> listaClientes = null;
        em = JPAUtil.getEntityManager();

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

    public static Cliente listarCliente(String idCliente) {
        em = JPAUtil.getEntityManager();
        Cliente cliente = null;
        try {
            cliente = em.find(Cliente.class, idCliente);
            return cliente;
        } catch (Exception e) {
                DIALOG.exbirMensagem(null, "Erro ao buscar as informações do cliente");
        } finally {

        }
        return cliente;
    }

    public static LicenseType listarMatriculasRepository(String matricula) {
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
}
