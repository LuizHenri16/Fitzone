package Service;

import Entity.*;
import Repository.ClienteRepository;
import Validation.CRIPTOGRAFAR;
import Validation.FORMAT;

import java.util.List;

public class ClienteService {

    public static void cadastrarService(Cliente cliente, ClienteContact contact, ClienteAddress address, ClienteInfoComplement complement) {
        cliente.setDataNascimento(FORMAT.converterData(cliente.getDataNascimento()));
        cliente.setCpf(CRIPTOGRAFAR.toSHA256(cliente.getCpf()));

       cliente.setContato(contact);
       cliente.setEndereco(address);
       cliente.setInfoComplement(complement);

        ClienteRepository.cadastrarRepository(cliente);
    }

    public static void editarService(Cliente cliente) {
        cliente.setDataNascimento(FORMAT.converterData(cliente.getDataNascimento()));
        cliente.setCpf(CRIPTOGRAFAR.toSHA256(cliente.getCpf()));

        ClienteRepository.editarRepository(cliente);
    };

    public static void excluirService(Cliente cliente) {
        ClienteRepository.excluirRepository(cliente);
    }

    public static List<Cliente> listarClientes() {
        return ClienteRepository.listarClientes();
    }

    public static Cliente listarCliente(String idCliente) {
        Cliente cliente = new Cliente();

        return ClienteRepository.listarCliente(idCliente);
    }

    public static LicenseType listarMatriculasService(String matricula) {
        return ClienteRepository.listarMatriculasRepository(matricula);
    }

}
