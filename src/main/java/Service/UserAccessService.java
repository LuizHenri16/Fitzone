package Service;

import Entity.UserAccess;
import Repository.UserAccessRepository;
import Validation.DIALOG;
import Validation.CRIPTOGRAFAR;

import java.util.List;

public class UserAccessService {

    public static UserAccess loginService(String userName, String password) {
        UserAccess usuario = UserAccessRepository.loginRepository(userName, CRIPTOGRAFAR.toSHA256(password));

        if (usuario == null) {
            DIALOG.exbirMensagem(null, "Usuário incorreto");
        } else {
            return usuario;
        }
        return usuario;
    }

    public static void cadastrarService(String userName, String passwordConfirm, String accessType) {
        try {
            UserAccess newUser = new UserAccess();

            newUser.setName(userName);
            newUser.setPassword(CRIPTOGRAFAR.toSHA256(passwordConfirm));
            newUser.setAccessType(accessType);

            UserAccessRepository.cadastrarRepository(newUser);

        } catch (Exception e) {
            DIALOG.exbirMensagem(null, "Ocorreu um erro no cadastro!");
        }
    }

    public static List<UserAccess> listarService() {
        List<UserAccess> lista = UserAccessRepository.listarRepository();
        return lista;
    }

    public static void apagarService(String id) {
        UserAccessRepository.apagarRepository(id);
    }

}
