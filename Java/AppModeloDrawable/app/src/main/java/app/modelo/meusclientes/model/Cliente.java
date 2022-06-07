package app.modelo.meusclientes.model;

public class Cliente {
    private int id;
    private String nome;
    private int IDADE;
    private int telefone;
    private String email;
    private int cep;
    private String bairro;
    private String logradouro;
    private String numero;
    private boolean TermosDeUso;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIDADE() {
        return IDADE;
    }

    public void setIDADE(int IDADE) {
        this.IDADE = IDADE;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isTermosDeUso() {
        return TermosDeUso;
    }

    public void setTermosDeUso(boolean termosDeUso) {
        TermosDeUso = termosDeUso;
    }
}