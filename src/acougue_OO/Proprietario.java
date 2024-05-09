package acougue_OO;

public class Proprietario {
    private String nome;
    private String nomeAcougue;
    private String cidade;

    public Proprietario() {

    }

    public Proprietario(String nome, String nomeAcougue, String cidade) {
        this.nome = nome;
        this.nomeAcougue = nomeAcougue;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAcougue() {
        return nomeAcougue;
    }

    public void setNomeAcougue(String nomeAcougue) {
        this.nomeAcougue = nomeAcougue;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
