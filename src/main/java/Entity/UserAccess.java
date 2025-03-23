package Entity;

import lombok.Data;

@Data
public class UserAccess {
    private int id;
    private String name;
    private String password;
    private String accessType;
}
