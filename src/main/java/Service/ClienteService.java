package Service;

import DTO.AniversarianteDTO;
import Entity.*;
import Repository.ClienteRepository;
import Validation.CRIPTOGRAFAR;
import Validation.FORMAT;
import java.util.List;
import static Repository.ClienteRepository.*;

public class ClienteService {

    public static void postCustomerService(Cliente cliente)  {
        cliente.setDataNascimento(FORMAT.converterData(cliente.getDataNascimento()));
        cliente.setCpf(CRIPTOGRAFAR.criptografarAES(cliente.getCpf()));
        
        postCustomerRepository(cliente);
    }

    public static void updateCustomerService(Cliente cliente) {
        cliente.setDataNascimento(FORMAT.converterData(cliente.getDataNascimento()));
        cliente.setCpf(CRIPTOGRAFAR.criptografarAES(cliente.getCpf()));
        
        updateCustomerRepository(cliente);
    }

    public static void deleteCustomerService(Cliente cliente) {
        deleteCustomerRepository(cliente);
    }

    public static List<Cliente> getCustomersService() {
        return getCustomersRepository();
    }

    public static Cliente getCustomerService(String idCliente) {
        return getCustomerRepository(idCliente);
    }

    public static LicenseType getRegistryService(String matricula) {
        return listarMatriculasRepository(matricula);
    }

    public static Integer getCountActiveCustomersService() {
        return getCountActiveCustomersRepository();
    }

    public static Integer getCountRegisteredCustomersService() {
        return getCountRegisteredCustomersRepository();
    }

    public static List<AniversarianteDTO> getBirthdayCustomerService() {
        return getBirthdayCustomerRepository();
    }

}
