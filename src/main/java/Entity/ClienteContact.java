package Entity;

import lombok.Data;

@Data
public class ClienteContact {
    private int id;
    private String numero;
    private String numero_emeregencia;
    private Cliente cliente;
}
