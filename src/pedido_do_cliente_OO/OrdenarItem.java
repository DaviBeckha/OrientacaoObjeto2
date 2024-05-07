package pedido_do_cliente_OO;

public class OrdenarItem {

    private Integer quantitade;
    private Double preco;

    private Produto produto;

    public OrdenarItem() {

    }

    public OrdenarItem(Integer quantitade, Double preco, Produto produto) {
        this.quantitade = quantitade;
        this.preco = preco;
        this.produto = produto;
    }
    public Integer getQuantitade() {
        return quantitade;
    }
    public void setQuantitade(Integer quantitade) {
        this.quantitade = quantitade;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Double subTotal() {
        return preco * quantitade;
    }

    @Override
    public String toString() {
        return getProduto().getNome() +
                ", $"
                + String.format("%.2f", getPreco())
                + ", Quantitade: " +
                quantitade + " Subtotal: " +
                String.format("%.2f", subTotal());

    }
}
