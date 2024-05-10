package acougue_OO;

import java.util.ArrayList;
import java.util.List;

public class OrdenarProdutos {

    private Integer quantidade;
    private Double preco;
    private Carne carne;

    public OrdenarProdutos (){

    }

    public OrdenarProdutos(Integer quantidade, Double preco, Carne carne) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.carne = carne;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Carne getProduto() {
        return carne;
    }

    public void setProduto(Carne carne) {
        this.carne = carne;
    }
    public Double subTotal() {
        return preco * quantidade;
    }

    public String toString(Boolean mostrarSubTotal) { // Esta recebendo a formatação de Carne
        return carne.toString() + "Quantidade: " + quantidade + getSubTotal(mostrarSubTotal);
    }

    private String getSubTotal(Boolean mostrarSubTotal) {
        return mostrarSubTotal ? " Subtotal: "+ subTotal() : "";
    }
}


