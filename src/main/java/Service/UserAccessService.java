package Service;

import Entity.UserAccess;
import Repository.UserAccessRepository;
import Validation.DIALOG;
import Validation.MD5;
import View.AvisoForm;
import java.util.List;

public class UserAccessService {

    public static UserAccess loginService() {
        UserAccess usuario = UserAccessRepository.loginRepository();
            //Validação do login e retorno o usuário
        return usuario;
    }

    public static void cadastrarService(String userName, String passwordConfirm, String accessType) {
           try {
               UserAccess newUser = new UserAccess();
               
               newUser.setName(userName);
               newUser.setPassword(MD5.toMD5(passwordConfirm));
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
        
        public static void apagarService() {

    }
        
        
}
