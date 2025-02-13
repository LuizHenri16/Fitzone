package fitzoneapp.Model;

public class ClienteContact {
    private int ID;
    private int cliente_ID;
    private String numero;
    private String numero_emergencia;

    public ClienteContact() {
    }

    public ClienteContact(int ID, int cliente_ID, String numero, String numero_emergencia) {
        this.ID = ID;
        this.cliente_ID = cliente_ID;
        this.numero = numero;
        this.numero_emergencia = numero_emergencia;
    }
}
