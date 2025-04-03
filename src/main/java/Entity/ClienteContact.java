package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contato_aluno")
public class ClienteContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "contato")
    private String numero;

    @Column(name = "contatoEmergencia")
    private String numero_emeregencia;

    @OneToOne()
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
