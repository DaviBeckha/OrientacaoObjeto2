package trabalhos_faculdade.JogadorFutebol;

import provaHetero.Produto;

import javax.swing.*;
import java.util.ArrayList;

public class JogadoresMain {
    public static void main(String[] args) {
        ArrayList<Jogadores> jogador = new ArrayList<Jogadores>();
        /*1 - Cadastrar Jogador
        2 - Mostrar os dados do jogador que teve o maior número de gols
        3 - Mostrar os dados do jogador com menor número de gols
        4 - Mostrar os dados de todos os goleiros que fizeram algum gol no campeonato
        5 - mostrar todos os jogadores que utilizaram a camisa número 10*/

        int op = 0;
        do {
            op = menu();
            if(op == 1)   jogador.add(lerJogador());//produtos.add(leProduto());
            if (op == 2) maiorGol(jogador);
            if (op == 3) menorGol(jogador);
            if (op == 4) goleirosComMenorGol(jogador);
            if (op == 5) jogadorComCamisa10(jogador);
            if (op == 6) System.out.printf("Saindo go mengão.");
        }while(op != 6);

    }

    public static int menu() {
        String op = "1 - Cadastrar jogador \n" +
                "2 - Jogador que teve mais gols \n" +
                "3 - Mostrar jogador com menos gols \n"+
                "4 - Goleiros que fizeram gol no campeonato \n" +
                "5 - Mostrar jogador que utilizam a camisa 10 \n" +
                "6-  Sair";

        return Integer.parseInt(JOptionPane.showInputDialog(null, op));
    }
    public static Jogadores lerJogador() {
        Jogadores jogador = new Jogadores();
        jogador.nome = insNome();
        jogador.posicao = insPosicao();
        jogador.time = insTime();
        jogador.numero = insNumero();
        jogador.gol = insGol();

        return jogador;
    }
    public static String insNome() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do jogador: ");
        if (nome == null || nome.trim().isEmpty() || nome.length() < 3) {
            msg("Nome incorreto!\nPor favor, digite um nome válido ");
            return insNome();
        }
        return nome;
    }
    public static String insPosicao() {
        String posicao = JOptionPane.showInputDialog(null, "Digite a posição do jogador: ");
        if (posicao == null || posicao.trim().isEmpty()) {
            msg("Posição incorreta!\nPor favor, digite uma posição válida ");
            return insPosicao();
        }
        return posicao;
    }
    public static String insTime() {
        String time = JOptionPane.showInputDialog(null, "Digite o time: ");
        if (time == null || time.trim().isEmpty() || time.length() == 3) {
            msg("Time inválido !\nPor favor, digite um time ");
            return insTime();
        }
        return time;
    }
    public static int insNumero() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do jogador: "));
        if (numero <= 0) {
            msg("Número inválido!\nPor favor, digite um número válido ");
            return insNumero();
        }
        return numero;
    }
    public static int insGol() {
        int gol = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de gols do jogador: "));
        if (gol < 0) {
            msg("Número de gols inválido!\nPor favor, digite um número de gols válido ");
            return insGol();
        }
        return gol;
    }



    public static void maiorGol(ArrayList<Jogadores> jogadores) {
        int maiorGol = 0;
        Jogadores jogadorComMaiorGol = null;
        for (Jogadores j : jogadores) {
            if (j.gol > maiorGol) {
                maiorGol = j.gol;
                jogadorComMaiorGol = j;
            }
        }
        String ret = "Jogador com maior gol: " + jogadorComMaiorGol.nome + ", todos os gols: " + maiorGol;
        msg(ret);
    }
    public static void menorGol(ArrayList<Jogadores> jogadores) {
        int menorGol = Integer.MAX_VALUE;
        Jogadores jogadorComMenorGol = null;
        for (Jogadores j : jogadores) {
            if (j.gol < menorGol) {
                menorGol = j.gol;
                jogadorComMenorGol = j;
            }
        }
        String ret = "Jogador com menor gol: " + jogadorComMenorGol.nome + " do time " + jogadorComMenorGol.time + ", todos os gols: " + menorGol;
        msg(ret);
    }
    public static void goleirosComMenorGol(ArrayList<Jogadores> jogador) {
        String ret = "";
        int menorGol = 0;
        for (Jogadores j : jogador) {
            if (j.posicao.equalsIgnoreCase("goleiro")) {
                ret =("Jogador com menor gol "+ j.nome + " do time " + j.time +" todos os gols: " + menorGol);
            }
        }
        msg(ret);
    }

    public static void jogadorComCamisa10(ArrayList<Jogadores> jogadores) {
        String ret = "";
        for (Jogadores j : jogadores) {
            if (j.numero == 10) {
                ret += "\nNome: " + j.nome + ", Time: " + j.time;
            }
        }
        msg(ret);
    }

    public static void msg(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }



}



