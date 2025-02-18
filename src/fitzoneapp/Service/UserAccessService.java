package fitzoneapp.Service;

import fitzoneapp.Model.LoginResponse;
import fitzoneapp.Model.UserAccess;
import fitzoneapp.Repository.UserAccessRepository;
import fitzoneapp.Util.AccessType;

public class UserAccessService {

    private UserAccessRepository userAccessRepository = new UserAccessRepository();
    private UserAccess userAccess;

    public void addUser(String userName, String userPassword, AccessType accessType) {
        userAccess = new UserAccess(userName, userPassword, accessType);
        userAccessRepository.addUser(userAccess);
    }

    public LoginResponse makeLogin(String userName, String userPassword) {
        return userAccessRepository.makeLogin(userName, userPassword);
    }

    public UserAccessRepository getUserAccessRepository() {
        return userAccessRepository;
    }

    public void setUserAccessRepository(UserAccessRepository userAccessRepository) {
        this.userAccessRepository = userAccessRepository;
    }

    public UserAccess getUserAccess() {
        return userAccess;
    }

    public void setUserAccess(UserAccess userAccess) {
        this.userAccess = userAccess;
    }
}
