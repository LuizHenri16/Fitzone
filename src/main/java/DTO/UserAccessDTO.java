package DTO;

public class UserAccessDTO {
    private String username;
    private String userPassword;
    private String accessType;

    public UserAccessDTO(String username, String userPassword, String accessType) {
        this.username = username;
        this.userPassword = userPassword;
        this.accessType = accessType;
    }

    public UserAccessDTO(String username, String userPassword) {
        this.username = username;
        this.userPassword = userPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }
}
