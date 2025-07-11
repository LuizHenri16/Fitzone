package Service;

import DTO.AniversarianteDTO;
import Entity.*;

import java.util.List;
import static Repository.ClienteRepository.*;
import static Validation.FORMAT.*;
import static Validation.CRIPTOGRAFAR.*;

public class ClienteService {

    public static void postCustomerService(Cliente cliente)  {
        cliente.setDataNascimento(converterData(cliente.getDataNascimento()));
        cliente.setCpf(criptografarAES(cliente.getCpf()));
        
        postCustomerRepository(cliente);
    }

    public static void updateCustomerService(Cliente cliente) {
        cliente.setDataNascimento(converterData(cliente.getDataNascimento()));

        cliente.setCpf(criptografarAES(cliente.getCpf()));
        
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
        return getRegistryRepository(matricula);
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
