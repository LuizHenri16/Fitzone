package Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAccess {
    private int id;
    private String name;
    private String password;
    private String accessType;
}
