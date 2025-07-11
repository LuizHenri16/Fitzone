package Service;

import Entity.UserAccess;
import Repository.UserAccessRepository;
import Validation.DIALOG;
import Validation.CRIPTOGRAFAR;
import java.util.List;
import static Repository.UserAccessRepository.*;
import static Validation.CRIPTOGRAFAR.*;

public class UserAccessService {

    public static UserAccess loginService(String userName, String password) {
        UserAccess usuario = loginRepository(userName, CRIPTOGRAFAR.toSHA256(password));

        if (usuario == null) {
            DIALOG.exbirMensagem("Usuário incorreto");
        } else {
            return usuario;
        }
        return usuario;
    }

    public static void postUserAccessService(String userName, String passwordConfirm, String accessType) {
            UserAccess newUser = new UserAccess();

            newUser.setName(userName);
            newUser.setPassword(toSHA256(passwordConfirm));
            newUser.setAccessType(accessType);

            cadastrarRepository(newUser);
    }

    public static List<UserAccess> getUserAccessService() {
        return getUserAccessRepository();
    }

    public static void deleteUserAccessService(String id) {
        deleteUserAccessRepository(id);
    }
}
