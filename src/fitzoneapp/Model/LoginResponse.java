package fitzoneapp.Model;

import fitzoneapp.Util.AccessType;

public class LoginResponse {
    private AccessType accessTypeResponse;
    private boolean loginResponse;


    public LoginResponse(boolean loginResponse, AccessType accessTypeResponse) {
        this.accessTypeResponse = accessTypeResponse;
        this.loginResponse = loginResponse;
    }

    public AccessType getAccessTypeResponse() {
        return accessTypeResponse;
    }

    public void setAccessTypeResponse(AccessType accessTypeResponse) {
        this.accessTypeResponse = accessTypeResponse;
    }

    public boolean isLoginResponse() {
        return loginResponse;
    }

    public void setLoginResponse(boolean loginResponse) {
        this.loginResponse = loginResponse;
    }
}
