package Entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Payment {
    private int id;
    private LicenseType licenseType;
    private LocalDate lastPayment;
    private Cliente cliente;
}
