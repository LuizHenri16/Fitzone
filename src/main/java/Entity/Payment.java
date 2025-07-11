package Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Pagamento")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_tipo_matricula")
    private LicenseType licenseType;

    @Column(name = "data_ultimo_pagamento")
    private String lastPayment;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
