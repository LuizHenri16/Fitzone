package Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteAddress {
    private int id;
    private String address;
    private Cliente cliente;


}
