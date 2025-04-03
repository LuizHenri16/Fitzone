package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity()
@Table(name = "tipo_matricula")
public class LicenseType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo_matricula")
    private String licenseType;

    @Column(name = "valor_matricula")
    private Double price;

    @Override
    public String toString() {
        return this.licenseType;
    }
}
