package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "info_complementar")
public class ClienteInfoComplement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "peso")
    private double weight;

    @Column(name = "altura")
    private double height;

    @Column(name = "historico_saude")
    private String healthHistory;

    @OneToOne()
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

}
