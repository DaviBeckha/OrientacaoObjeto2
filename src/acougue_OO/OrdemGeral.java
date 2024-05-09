package acougue_OO;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemGeral {
    private Date dtcompra;
    private Cliente cliente;


    private List<OrdenarProdutos> carne = new ArrayList<OrdenarProdutos>();

    public OrdemGeral(){
    }

    public OrdemGeral(Date dtcompra, Cliente cliente) {
        this.dtcompra = dtcompra;
        this.cliente = cliente;
    }

    public Date getDtcompra() {
        return dtcompra;
    }

    public void setDtcompra(Date dtcompra) {
        this.dtcompra = dtcompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<OrdenarProdutos> getCarne() {
        return carne;
    }

    public void addItem(OrdenarProdutos carnes){
        carne.add(carnes);
    }

    public void removeItem(OrdenarProdutos carnes){
            carne.remove(carnes);
    }

}
