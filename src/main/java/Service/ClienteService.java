package Service;

import Entity.Cliente;
import Repository.ClienteRepository;

import java.util.List;

public class ClienteService {

    public static void cadastrarService() {

    }

    public static void editarService() {

    };

    public static void excluirService() {

    }

    public static List<Cliente> listarClientes() {

        return ClienteRepository.listarClientes();
    }

    public static Cliente listarCliente(Integer idCliente) {
        Cliente cliente = new Cliente();

        return ClienteRepository.listarCliente(idCliente);
    }
}
