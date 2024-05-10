package acougue_OO;

import java.util.Date;

public class OrdemGeralVenda extends OrdemGeral{

    private Cliente cliente;


    public OrdemGeralVenda(Date dtcompra, Cliente cliente) {
        super(dtcompra);
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString() {
        return super.toString(true);
    }
}
