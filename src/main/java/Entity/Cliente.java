package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Entity
@Table(name = "ClienteCadastro")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "nome_cliente")
    private String nome;

    @Column(name= "cpf")
    private String cpf;
    
    @Column(name= "data_nascimento")
    private String dataNascimento;
    
    @Column(name= "email")
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "id_tipoMatricula", nullable = false)
    private LicenseType matricula;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private ClienteContact contato;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private ClienteAddress endereco;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private ClienteInfoComplement infoComplement;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Payment> pagamento;
    
    @Column(name= "status")
    private String status;

}
