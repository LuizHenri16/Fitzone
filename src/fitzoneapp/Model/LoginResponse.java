package fitzoneapp.Model;


public class LoginResponse {
    private UserAccess userResponse;
    private boolean loginResponse;


    public LoginResponse(boolean loginResponse, UserAccess accessTypeResponse) {
        this.userResponse = accessTypeResponse;
        this.loginResponse = loginResponse;
    }

    public UserAccess getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(UserAccess accessTypeResponse) {
        this.userResponse = accessTypeResponse;
    }

    public boolean isLoginResponse() {
        return loginResponse;
    }

    public void setLoginResponse(boolean loginResponse) {
        this.loginResponse = loginResponse;
    }
}
