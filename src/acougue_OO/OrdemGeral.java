package acougue_OO;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemGeral {
    private Date dtcompra;



    public List<OrdenarProdutos> carne = new ArrayList<OrdenarProdutos>();

    public OrdemGeral(){
    }

    public OrdemGeral(Date dtcompra) {
        this.dtcompra = dtcompra;

    }
    public Date getDtcompra() {
        return dtcompra;
    }

    public void setDtcompra(Date dtcompra) {
        this.dtcompra = dtcompra;
    }

    public List<OrdenarProdutos> getCarne() {
        return carne;
    }

    public OrdenarProdutos getItemByCodigo(String codigo) {
        return carne.stream() //
                .filter(ordenarProdutos -> ordenarProdutos.getProduto().getCodigo().equals(codigo)) //
                .findAny() //
                .orElse(null);
    }

    public void addItem(OrdenarProdutos carnes){
        carne.add(carnes);
    }

    public void removeItem(OrdenarProdutos carnes){
            carne.remove(carnes);
    }


    public String toString(Boolean mostrarSubTotal) {
       String result = "";
        for(OrdenarProdutos car: carne) {
            result += car.toString(mostrarSubTotal);   // Recebendo de Ordenar produtos
        }
        return result;
    }

}
