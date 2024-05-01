package simulado;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Simulado {

    private static DecimalFormat formato = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[100];
        int[] idade = new int[100];
        String[] sexo = new String[100];
        int op = 0;
        int count = 0;
        double[][] notas = new double[100][3];

        do {
            op = mostraMenu();
            if (op == 1) {
                cadastrarPessoas(nome, idade, sexo, count, notas);
                count++;
            }
            if (op == 2) {
                String mediaAlunos = calcularMedia(nome, notas, count);
                JOptionPane.showMessageDialog(null, mediaAlunos);
            }
            if (op == 3){
                String aprovadoOunao = aprovadoReprovado(nome,notas,count);
                JOptionPane.showMessageDialog(null,aprovadoOunao);
            }
            if (op ==4) {
                String homensEMulheres = homensEmulheresReprovados(nome,notas,count,sexo);
                    JOptionPane.showMessageDialog(null,homensEMulheres);
            }
            if (op == 5) {
                double mediaIdadeTurma = idadeMedia(count, idade);
                JOptionPane.showMessageDialog(null, "Média de idade da turma: " + formato.format(mediaIdadeTurma));
            }
            if (op ==6){
                String listaSexos = listaSexo(nome,count,sexo);
                JOptionPane.showMessageDialog(null,listaSexos);
            }
            if (op == 7) {
                String listaIdade = listaIdade(nome,idade,count);
                JOptionPane.showMessageDialog(null, listaIdade);
            }

        } while (op != 8);
    }

    private static int mostraMenu() {
        String m = "1 - Cadastrar\n" +
                "2 - Média de todos os alunos\n" +
                "3 - Exibir alunos aprovados, recuperação ou reprovado\n" +
                "4 - Percentual de mulheres e homens reprovados\n" +
                "5 - Médias das idades da turma\n" +
                "6 - Listar alunos por sexo\n" +
                "7 - Listar alunos por idade\n" +
                "8 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }

    private static String lerNome() {
        String nome = JOptionPane.showInputDialog("Nome");
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido.");
            return lerNome();
        }
        return nome;
    }

    private static String lerSexo() {
        String sexo = JOptionPane.showInputDialog("Sexo M ou F: ");
        return sexo;
    }

    private static int lerIdade() {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        if (idade < 17 || idade > 99) {
            JOptionPane.showMessageDialog(null, "Idade entre 17 e 99");
            return lerIdade();
        }
        return idade;

    }

    private static double lerNotas() {
        String nota = JOptionPane.showInputDialog("Notas: ");
        return Double.parseDouble(nota);
    }

    private static void cadastrarPessoas(String[] nome, int[] idade, String[] sexo, int count, double notas[][]) {
        if (count < 20) {
            nome[count] = lerNome();
            idade[count] = lerIdade();
            sexo[count] = lerSexo();

            for (int j = 0; j < 3; j++) {
                notas[count][j] = lerNotas();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Memória cheia:");

        }
    }

    private static String calcularMedia(String[] nome, double notas[][], int count) {
        String busca = "";
        for (int i = 0; i < count; i++) {
            double somaNotas = 0;
            for (int j = 0; j < notas[i].length; j++) {
                somaNotas += notas[i][j];
            }

            double mediaNotas = somaNotas / notas[i].length;
            String numeroFormatado = formato.format(mediaNotas);
            busca += "Aluno: " + nome[i] + ", Média: " + numeroFormatado + "\n";
        }
        return busca;
    }

    private static String aprovadoReprovado(String[] nome, double notas[][], int count) {
        String busca = "";
        for (int i = 0; i < count; i++) {
            double somaNotas = 0;
            for (int j = 0; j < notas[i].length; j++) {
                somaNotas += notas[i][j];
            }

            double mediaNotas = somaNotas / notas[i].length;
            String numeroFormatado = formato.format(mediaNotas);

            if (mediaNotas >= 0 && mediaNotas <=3){  //Reprovado
                busca += "Aluno: " + nome[i] + ", Média: " + numeroFormatado + " Reprovado "+"\n";
            } else if (mediaNotas > 3 && mediaNotas <= 7) { //Recuperação
                busca += "Aluno: " + nome[i] + ", Média: " + numeroFormatado + " Recuperação "+"\n";
            } else {
                busca += "Aluno: " + nome[i] + ", Média: " + numeroFormatado + " Aprovado"+"\n";
            }
        }
        return busca;
    }
    private static String homensEmulheresReprovados(String[] nome, double notas[][], int count, String[] sexo) {
        String busca = "";
        for (int i = 0; i < count; i++) {
            double somaNotas = 0;
            for (int j = 0; j < notas[i].length; j++) {
                somaNotas += notas[i][j];
            }

            double mediaNotas = somaNotas / notas[i].length;
            String numeroFormatado = formato.format(mediaNotas);
            if (sexo[i].equalsIgnoreCase("F") && mediaNotas <= 3){
                busca += "Aluno: " + nome[i] + ", Média: " + numeroFormatado + " Reprovado "+"\n";
            } else if (sexo[i].equalsIgnoreCase("M") && mediaNotas <= 3) {
                busca += "Aluno: " + nome[i] + ", Média: " + numeroFormatado + " Reprovado "+"\n";
            }
        }
        return busca;
    }
    private static double idadeMedia(int count, int[] idade) {
        int somaIdades = 0;
        for (int i = 0; i < count; i++) {
            somaIdades += idade[i];
        }
        double mediaTurma = (double) somaIdades / count;
        return mediaTurma;
    }
    private static String listaSexo(String[] nome, int count, String[] sexo){
        String busca = "";

        for (int i =0;i < count;i++){
            if (sexo[i].equalsIgnoreCase("M")) {
                busca +=  "Aluno: " + nome[i] + " :Homem"+"\n";
            } else if (sexo[i].equalsIgnoreCase("F")) {
                busca +=  "Aluno: " + nome[i] + " :Mulher"+"\n";
            }
        }
        return busca;
    }
    private static String listaIdade(String[] nome, int[] idade,int count){
        String busca = "";
        for (int i = 0;i < count;i++){
            busca += "Aluno: " + nome[i] + " idade: " + idade[i] +"\n";
        }
        return busca;
    }
}


