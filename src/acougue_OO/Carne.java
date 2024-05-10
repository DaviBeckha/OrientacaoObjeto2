package acougue_OO;

public class Carne {

    private String nome;
    private Double preco;
    private String codigo;

    private Proprietario proprietario;
    private Cliente cliente;

    public Carne() {
    }

    public Carne(String nome, Double preco, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String toString() { //De onde vem a formatação de escrita
        StringBuilder sb = new StringBuilder();
      /*  sb.append("Proprietário: " + proprietario.getNomeProprietario() + "\n");
        sb.append("Açogue: " + proprietario.getNomeAcougue() + "\n");
        sb.append("Localização: " + proprietario.getCidade() + "\n");
        sb.append("Nome do cliente: "+ cliente.getNome() + "\n");
        sb.append("CPF: " + cliente.getCpf() + "\n");
        sb.append("Endereço: " + cliente.getEndereco() + "\n"); */
        sb.append("Produtos: " + nome + "\n");
        sb.append("Preço: " + preco + "\n");
        sb.append("Código: " + codigo + "\n");
        return sb.toString();
    }

}
