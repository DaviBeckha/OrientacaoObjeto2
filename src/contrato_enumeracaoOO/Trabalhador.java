package contrato_enumeracaoOO;

import contrato_enumeracaoOO.enums.NiveisDeCargo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NiveisDeCargo cargo;
    private Double salarioBase;

    private Departamento departamento;
    private List<HoraDeContrato> contratos = new ArrayList<>();


    public Trabalhador (){
    }

    public Trabalhador(String nome, NiveisDeCargo cargo, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NiveisDeCargo getCargo() {
        return cargo;
    }

    public void setCargo(NiveisDeCargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraDeContrato> getContratos() {
        return contratos;
    }

    public void addContrato(HoraDeContrato contrato){
        contratos.add(contrato);
    }

    public void removeContrato(HoraDeContrato contrato) {
        contratos.remove(contrato);
    }
    public double Renda(int ano, int mes) {
        double soma = salarioBase;

        Calendar cal = Calendar.getInstance();
        for (HoraDeContrato c : contratos) {
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = cal.get(Calendar.MONTH) + 1;
            if (c_ano == ano && mes == c_mes) {
                soma += c.valorTotal();

            }
        }
        return soma;
    }

}
