package Service;

import Entity.UserAccess;
import Repository.UserAccessRepository;
import Validation.MD5;
import View.AvisoForm;
import java.util.List;

public class UserAccessService {
    
    public static void cadastrarService(String userName, String passwordConfirm, String accessType) {
           try {
               UserAccess newUser = new UserAccess();
               
               newUser.setName(userName);
               newUser.setPassword(MD5.toMD5(passwordConfirm));
               newUser.setAccessType(accessType);
               
               UserAccessRepository.cadastrarRepository(newUser);
               
        } catch (Exception e) {
             new AvisoForm(null, true, "Ocorreu um erro no cadastro!").setVisible(true);
        }
    }
    
        public static List<UserAccess> listarService() {
        List<UserAccess> lista = UserAccessRepository.listarRepository();
        return lista;
    }
        
        public static void apagarService() {

    }
        
        
}
