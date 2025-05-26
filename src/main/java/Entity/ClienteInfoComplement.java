package Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "info_complementar")
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
