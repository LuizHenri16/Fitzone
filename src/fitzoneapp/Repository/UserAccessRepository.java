package fitzoneapp.Repository;

import fitzoneapp.Model.LoginResponse;
import fitzoneapp.Model.UserAccess;

import java.util.ArrayList;
import java.util.List;

public class UserAccessRepository {
    private List<UserAccess> users = new ArrayList<>();

    /** Simulando o banco de dados, no Repository é onde será feito as querys no banco de dados.
     * aqui terá a comunicação com o DB levando a senha que terá segurança, então levando a hash da senha e procurando
     * junto ao nome de usuário.
    */

    public void addUser(UserAccess user) {
        users.add(user);
    }

    public LoginResponse makeLogin(String userName, String userPassword) {
        for (UserAccess user : users) {
            if (user.getName().equals(userName) && user.getPassword().equals(userPassword)) {
                return new LoginResponse(true, user);
            }
        }
        return new LoginResponse(false, null);
    }
}
