package acougue_OO;

import java.text.SimpleDateFormat;

public class Cliente {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    protected String nome;
    protected Long cpf;
    protected String endereco;


    public Cliente() {

    }

    public Cliente(String nome, Long cpf ,String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
