package DTO;

public class ClienteDTO {

    //Basic
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String email;

    //License
    private String matricula;

    //Contact
    private String numero;
    private String numeroEmergencia;

    //Address
    private String address;

    //Info Complement
    private double weight;
    private double height;
    private String healthHistory;

    public ClienteDTO(String nome, String cpf, String dataNascimento, String email, String matricula, String numero, String numeroEmergencia, String address, double weight, double height, String healthHistory) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.matricula = matricula;
        this.numero = numero;
        this.numeroEmergencia = numeroEmergencia;
        this.address = address;
        this.weight = weight;
        this.height = height;
        this.healthHistory = healthHistory;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHealthHistory() {
        return healthHistory;
    }

    public void setHealthHistory(String healthHistory) {
        this.healthHistory = healthHistory;
    }
}
