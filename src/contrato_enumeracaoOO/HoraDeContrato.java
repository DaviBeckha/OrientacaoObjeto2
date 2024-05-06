package contrato_enumeracaoOO;

import java.util.Date;

public class HoraDeContrato {

    private Date date;
    private Double valorPorhora;
    private Integer horas;

    public HoraDeContrato (){

    }

    public HoraDeContrato(Date date, Double valorPorhora, Integer horas) {
        this.date = date;
        this.valorPorhora = valorPorhora;
        this.horas = horas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValorPorhora() {
        return valorPorhora;
    }

    public void setValorPorhora(Double valorPorhora) {
        this.valorPorhora = valorPorhora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public Double valorTotal() {
        return valorPorhora * horas;
    }
}
