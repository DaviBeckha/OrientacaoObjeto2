package Heranca;

public class ContaEmpresario  extends Conta{

    private Double limiteEmprestimo;

    //subclasse

    public ContaEmpresario(){
        super(); // para pegar a logica do construtor padrao da outra classe
    }

    public ContaEmpresario(Integer numero, String holder, double saldo, Double limiteEmprestimo) {
        super(numero, holder, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(Double quantia) {
       if (quantia <= limiteEmprestimo) {
           saldo += quantia - 10;
       }
    }

}

