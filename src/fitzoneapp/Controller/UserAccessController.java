package fitzoneapp.Controller;

import fitzoneapp.Model.LoginResponse;
import fitzoneapp.Service.UserAccessService;
import fitzoneapp.Util.AccessType;

public class UserAccessController {
    private UserAccessService userAccessService = new UserAccessService();

    public void addUser(String userName, String userPassword, AccessType accessType) {
        userAccessService.addUser(userName, userPassword, accessType);
        System.out.println("Uuário cadastrado");
    }

    public LoginResponse makeLogin(String userName, String userPassword) {
        return userAccessService.makeLogin(userName, userPassword);
    }

}
