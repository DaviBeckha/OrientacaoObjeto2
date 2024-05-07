package pedido_do_cliente_OO;

import aulas_enum_funcoes_simulado.simulado.enumercao.OrderStatus;
import pedido_do_cliente_OO.enuM.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {
    private Date dtCompra;
    private StatusPedido pedido;

     private Cliente cliente;

     private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

     private List<OrdenarItem> itens = new ArrayList<OrdenarItem>();

     public Ordem(){
     }

    public Ordem(Date dtCompra, StatusPedido pedido, Cliente cliente) {
        this.dtCompra = dtCompra;
        this.pedido = pedido;
        this.cliente = cliente;
    }

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public StatusPedido getPedido() {
        return pedido;
    }

    public void setPedido(StatusPedido pedido) {
        this.pedido = pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<OrdenarItem> getItens() {
        return itens;
    }

    public void addItem(OrdenarItem item){
        itens.add(item);
    }

    public void removeItem(OrdenarItem item){
        itens.remove(item);
    }

    public Double total(){
         Double total = 0.0;
         for(OrdenarItem item : itens){
             total += item.subTotal();
         }
         return total;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data da compra: ");
        sb.append(sdf.format(dtCompra) + "\n");
        sb.append("Estado do pedido: ");
        sb.append(pedido + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Lista dos itens:\n");
        for (OrdenarItem item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
