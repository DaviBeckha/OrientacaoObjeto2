package contrato_enumeracao_main;


import contrato_enumeracaoOO.Departamento;
import contrato_enumeracaoOO.HoraDeContrato;
import contrato_enumeracaoOO.Trabalhador;
import contrato_enumeracaoOO.enums.NiveisDeCargo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");


        System.out.print("Entre com nome do departamento: ");
        String departementoNome = sc.nextLine();
        System.out.println("Dados do trabalhador: ");
        System.out.print("Nome: ");
        String trabalhadorNome = sc.nextLine();
        System.out.print("Cargo:");
        String trabalhadorCargo = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador (trabalhadorNome,NiveisDeCargo.valueOf(trabalhadorCargo), salarioBase,new Departamento(departementoNome));


        System.out.println("Quantos contratos o trabalhador tem: ");
        int n = sc.nextInt();

        for (int i = 1;i <=n;i++){
            System.out.println("Entre com o contrato #" + i);
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataDoContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração em horas: ");
            int horas = sc.nextInt();

            HoraDeContrato contrato = new HoraDeContrato(dataDoContrato,valorPorHora,horas);
            trabalhador.addContrato(contrato);
        }

        System.out.println();
        System.out.println("Entre com mês e ano para calcular o salário (HH/YYYY): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: "+ trabalhador.getNome());
        System.out.println("Cargo: "+ trabalhador.getCargo());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Valor total na data: " + mesEAno + ": " + String.format("%.2f", trabalhador.Renda(ano,mes)));

        sc.close();
    }




}
