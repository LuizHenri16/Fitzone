package fitzoneapp.Model;

public class Cliente {
    private int ID;
    private String nome;
    private String dataNascimento;
    private ClienteContact contato;
    private String email;
    private ClienteAddress enderecoCompleto;
    private ClienteInfoComplement informacaoComplementar;
    private boolean Status;

    public Cliente() {
    }

    public Cliente(int ID, String nome, String dataNascimento, ClienteContact clienteContato, String email, ClienteAddress enderecoCompleto, boolean status) {
        this.ID = ID;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contato = clienteContato;
        this.email = email;
        this.enderecoCompleto = enderecoCompleto;
        Status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ClienteContact getContato() {
        return contato;
    }

    public void setContato(ClienteContact contato) {
        this.contato = contato;
    }

    public ClienteInfoComplement getInformacaoComplementar() {
        return informacaoComplementar;
    }

    public void setInformacaoComplementar(ClienteInfoComplement informacaoComplementar) {
        this.informacaoComplementar = informacaoComplementar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClienteAddress getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(ClienteAddress enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }



    // Aqui terá os métodos de validação dos dados que serão colocados pelo usuário. Como cpf, telefone, ou a data de
    // nascimento.
}
