package Repository;

import Entity.UserAccess;
import Service.UserAccessService;

import java.util.List;

public class UserAccessRepository {

    public static UserAccess loginRepository() {
        UserAccess usuario = UserAccessService.loginService();


        return usuario;
    }

    public static void cadastrarRepository(UserAccess usuario) {
        
    }
    
    public static List<UserAccess> listarRepository() {
        List<UserAccess> lista = null;
        return lista;
    }
    
    public static void apagarRepository() {

    }


}
