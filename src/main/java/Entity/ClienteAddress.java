package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "endereco_aluno")
public class ClienteAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "endereco")
    private String address;

    @OneToOne()
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
