package Entity;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class Despesa {
    private int id;
    private String descricao;
    private Double valor;
    private LocalDate data;
}
