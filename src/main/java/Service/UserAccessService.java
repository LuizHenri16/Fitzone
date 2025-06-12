package Service;

import Entity.UserAccess;
import Repository.UserAccessRepository;
import Validation.DIALOG;
import Validation.CRIPTOGRAFAR;
import java.util.List;
import static Repository.UserAccessRepository.*;

public class UserAccessService {

    public static UserAccess loginService(String userName, String password) {
        UserAccess usuario = loginRepository(userName, CRIPTOGRAFAR.toSHA256(password));

        if (usuario == null) {
            DIALOG.exbirMensagem(null, "Usuário incorreto");
        } else {
            return usuario;
        }
        return usuario;
    }

    public static void postUserAccessService(String userName, String passwordConfirm, String accessType) {
        try {
            UserAccess newUser = new UserAccess();

            newUser.setName(userName);
            newUser.setPassword(CRIPTOGRAFAR.toSHA256(passwordConfirm));
            newUser.setAccessType(accessType);

            cadastrarRepository(newUser);

        } catch (Exception e) {
            DIALOG.exbirMensagem(null, "Ocorreu um erro no cadastro!");
        }
    }

    public static List<UserAccess> getUserAccessService() {
        return getUserAccessRepository();
    }

    public static void deleteUserAccessService(String id) {
        deleteUserAccessRepository(id);
    }
}
