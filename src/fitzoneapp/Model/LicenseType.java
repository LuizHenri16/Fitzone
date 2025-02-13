package fitzoneapp.Model;

import fitzoneapp.Util.Licenseplate;

public class LicenseType {
    private int ID;
    private Licenseplate licenseType;
    private double price;

    public LicenseType() {
    }

    public LicenseType(int ID, Licenseplate licenseType, double price) {
        this.ID = ID;
        this.licenseType = licenseType;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Licenseplate getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(Licenseplate licenseType) {
        this.licenseType = licenseType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
