package fitzoneapp.Model;

public class ClienteAddress {
    private int ID;
    private int ID_Cliente;
    private String address;

    public ClienteAddress() {
    }

    public ClienteAddress(int ID, int idCliente, String address) {
        this.ID = ID;
        this.ID_Cliente = idCliente;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
