package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity()
@Table(name = "TipoMatricula")
public class LicenseType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo_matricula")
    private String licenseType;

    @Column(name = "valor_matricula")
    private Double price;

    @OneToMany(mappedBy = "licenseType", cascade = CascadeType.ALL)
    private List<Payment> payment;
}
