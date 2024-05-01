package simulado;



import javax.swing.*;

import java.util.Scanner;

public class Simulado {
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

        } while (op != 6);
    }

    private static int mostraMenu(){
        String m = "1 - Cadastrar\n" +
                "2 - Média de todos os alunos\n" +
                "3 - Exibir alunos aprovados, recuperação ou reprovado\n" +
                "4 - Percentual de mulheres e homens reprovados\n" +
                "5 - Médias das idades da turma\n" +
                "6 - Listar alunos por sexo\n" +
                "7 - Listar alunos por idade\n";
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

    private static String calcularMedia(String[] nome,double notas[][], int count) {
        String busca = "";
        for (int i = 0; i < notas[count].length; i++) {
            double somaNotas = 0;
            for (int j = 0; j < 3; j++) {
                somaNotas += notas[count][j];
            }

            double mediaNotas = somaNotas / notas[count].length;
            busca += "Aluno: " + nome[count] + ", Média: " + mediaNotas + "\n";
        }
        return busca;
    }
}



