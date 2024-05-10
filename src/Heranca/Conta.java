package Heranca;

public class Conta {
    private Integer numero;
    private String holder;
    protected double saldo;

    //super classe

    public Conta(){

    }
    public Conta(Integer numero, String holder, double saldo) {
        this.numero = numero;
        this.holder = holder;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getSaldo() {
        return saldo;
    }
    public void saque(Double quantia) {
        saldo -= quantia;
    }
    public void deposito(Double quantia){
        saldo += quantia;
    }
}
