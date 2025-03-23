package Entity;

import lombok.Data;

@Data
public class ClienteInfoComplement {


    private int id;
    private double weight;
    private double height;
    private String healthHistory;
    private Cliente cliente;


}
