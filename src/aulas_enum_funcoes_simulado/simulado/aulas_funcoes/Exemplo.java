package aulas_enum_funcoes_simulado.simulado.aulas_funcoes;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("nUMERO 1");
        int num1 = sc.nextInt();
        System.out.println("Numero 2");
        int num2 = sc.nextInt();
        somaDoisNumeros(num1,num2);
        int r = multiplicaDoisNumeros(num1,num2);

        System.out.println("Multiplicação " + r);

    }
    private static void somaDoisNumeros (int n1, int n2){ //Procedimento
        int soma = n1 + n2;
        System.out.println(soma);
    }

    private static int multiplicaDoisNumeros (int n1, int n2){ //função
        int result = n1 * n2;
        return result;
    }
}
