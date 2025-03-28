package Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteInfoComplement {

    private int id;
    private double weight;
    private double height;
    private String healthHistory;
    private Cliente cliente;


}
