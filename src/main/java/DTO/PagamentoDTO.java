package DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PagamentoDTO {
    private String dataUltimoPagamento;
    private String nomeCliente;
    private Double valorMatricula;
    private String email;
}
