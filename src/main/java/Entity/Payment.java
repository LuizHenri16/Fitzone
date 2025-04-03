package Entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Payment {
    private int id;
    private LicenseType licenseType;
    private LocalDate lastPayment;
    private Cliente cliente;
}
