package fitzoneapp.Model;

public class Payment {
    private int ID;
    private int clientID;
    private int LicenseTypeID;
    private String lastPayment;

    public Payment() {
    }

    public Payment(int ID, int clientID, int licenseTypeID, String lastPayment) {
        this.ID = ID;
        this.clientID = clientID;
        LicenseTypeID = licenseTypeID;
        this.lastPayment = lastPayment;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getLicenseTypeID() {
        return LicenseTypeID;
    }

    public void setLicenseTypeID(int licenseTypeID) {
        LicenseTypeID = licenseTypeID;
    }

    public String getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(String lastPayment) {
        this.lastPayment = lastPayment;
    }
}



