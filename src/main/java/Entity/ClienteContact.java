package Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteContact {
    private int id;
    private String numero;
    private String numero_emeregencia;
    private Cliente cliente;
}
