package aulas_enum_funcoes_simulado.simulado.aulas_funcoes;

import javax.swing.JOptionPane;

public class Exemplo1 {

    public static void main(String[] args) {
        String[] sexo = new String[100];
        String[] nome = new String[100];
        int[] anos = new int[100];

        int count = 0;

        int op = 0;
        do {
            op = menu();
            if (op == 1) {
                cadastraPessoa(nome, anos, sexo,count);
                count++;
            }
            if (op == 2) {
                String resultadoBusca = buscarPorNome(nome, anos, sexo, count);
                System.out.println(resultadoBusca);
            }
            if (op == 3) {
                double mediaIdadeHomens = calcularMediaIdadeHomens(sexo, anos, count);
                JOptionPane.showMessageDialog(null, "A média de idade dos homens é: " + mediaIdadeHomens);
            }
            if (op == 4) {
                double mediaIdadeMulheres = calcularMediaIdadeMulheres(sexo, anos, count);
                JOptionPane.showMessageDialog(null, "A média de idade das mulheres é: " + mediaIdadeMulheres);
            }
            if (op == 5){
                String allPeoples = todasPessoas(nome,anos,sexo,count);
                System.out.println("Todas as pessoas:"+ allPeoples);
            }

        }while(op!=6);
    }

    private static int menu() {
        String m = "1 - Cadastrar Pessoa\n" +
                "2 - Buscar por nome \n" +
                "3 - Media das Idades dos Homens\n"
                 + "4 - Média Idade mulheres\n" +
                 "5 - Todas as pessoas\n";
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }

    private static void cadastraPessoa(String[] nome, int[] anos, String[] sexo, int count) {
        if (count < nome.length) {
            nome[count] = JOptionPane.showInputDialog("Nome");
            anos[count] = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
            sexo[count] = JOptionPane.showInputDialog("Sexo (M/F):");
        } else {
            JOptionPane.showMessageDialog(null, "Memória cheia");
        }
    }

    private static String buscarPorNome(String[] nome, int[] anos, String[] sexo, int count) {
        String resposta = JOptionPane.showInputDialog(null, "Digite o nome que deseja procurar:");
        for (int i = 0; i < count; i++) {
            if (resposta.equals(nome[i])) {
                return "Nome: " + nome[i] + ", Ano: " + anos[i] + ", Sexo: " + sexo[i];
            }
        }
        return "Nome não encontrado!";
    }
    private static double calcularMediaIdadeHomens(String[] sexo, int[] anos, int count) {
        int somaIdadeHomens = 0;
        int quantidadeHomens = 0;

        for (int i = 0; i < count; i++) {
            if (sexo[i].equalsIgnoreCase("M")) {
                somaIdadeHomens += anos[i];
                quantidadeHomens++;
            }
        }
        if (quantidadeHomens == 0) {
            System.out.println("Não há homens");
            return 0;
        }
        return (double) somaIdadeHomens / quantidadeHomens;
    }
    private static double calcularMediaIdadeMulheres(String[] sexos, int[] anos, int count) {
        int somaIdadeMulheres = 0;
        int quantidadeMulheres = 0;

        for (int i = 0; i < count; i++) {
            if (sexos[i].equalsIgnoreCase("F")) {
                somaIdadeMulheres += anos[i];
                quantidadeMulheres++;
            }
        }
        if (quantidadeMulheres == 0) {
            System.out.println("Não há mulheres");
            return 0;
        }
        return (double) somaIdadeMulheres / quantidadeMulheres;
    }

    private static String todasPessoas(String[] nome, int[] anos, String[] sexo, int count) {
        String todasAsPessoas = "";

        for (int i = 0; i < count; i++) {
            todasAsPessoas += "\n"+"Nome: " + nome[i] + ", Ano: " + anos[i] + ", Sexo: " + sexo[i];
        }
        if (todasAsPessoas.isEmpty()) {
            return "Nenhuma pessoa cadastrada";
        } else {
            return todasAsPessoas;
        }
    }

}