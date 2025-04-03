package Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ADM_ACESSO")
public class UserAccess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "usuario_adm")
    private String name;

    @Column(name = "senha")
    private String password;

    @Column(name = "nivel_acesso")
    private String accessType;
}
