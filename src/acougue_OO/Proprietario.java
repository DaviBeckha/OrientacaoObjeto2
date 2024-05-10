package acougue_OO;

public class Proprietario {
    protected String nomeProprietario;
    protected String nomeAcougue;
    protected String cidade;

    public Proprietario() {

    }

    public Proprietario(String nomeProprietario, String nomeAcougue, String cidade) {
        this.nomeProprietario = nomeProprietario;
        this.nomeAcougue = nomeAcougue;
        this.cidade = cidade;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
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
