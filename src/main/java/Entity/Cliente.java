package Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private int id;
    private String nome;
    private String dataNascimento;
    private String email;

}
