package fitzoneapp.Model;

import fitzoneapp.Util.AccessType;

public class UserAccess {
    private int ID;
    private String name;
    private String password;
    private AccessType accessType;

    public UserAccess() {}

    public UserAccess(String name, String password, AccessType accessType) {
        this.name = name;
        this.password = password;
        this.accessType = accessType;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }

    //Aqui terá os métodos de validação para poder criar uma senha mais forte, garatindo ter um mínimo tamanho e caract-
    //eres especiais.
}
