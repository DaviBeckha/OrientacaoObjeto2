package trabalhos_faculdade.Biblioteca;

import trabalhos_faculdade.JogadorFutebol.Jogadores;

import javax.swing.*;
import java.util.ArrayList;

public class MainLivro {

    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<Livro>();
        ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
        /*- Cadastra o livro -- (Método )
1-Pode criar um método inteiro de cadastro passando as informações e as
validações.
2- Localiza um livro pelo seu código (Função- ListLivros )
3- Perguntar um nome e verificar se o usuário pegou emprestado (Função- Lista
Livros)
4- Dados de todos os livros publicados em 2020 (Função – ListLivros )
5- Listar todos os livros de um determinado gênero
*/

        int op = 0;
        do {
            op = menu();
        }while( op!= 6);



    }
    public static int menu() {
        String op = "1 - Cadastrar livros \n" +
                "2 - Procura código do livro \n" +
                "3 - Nome e ver se tem o livro emprestado \n"+
                "4 - Todos os livros de 2020 \n" +
                "5 - Mostrar livros do gênero \n" +
                "6-  Sair";

        return Integer.parseInt(JOptionPane.showInputDialog(null, op));
    }
    public static Livro lerLivro() {
        Livro livro = new Livro();
        livro.titulo = insNome();
        livro.autor = insAutor();
        livro.ano = insAno();
        livro.isbn = insIsbn();

        return livro;
    }
    public static Pessoa lerTitulo() {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = insNome();
        pessoa.idade = insIdade();

        return pessoa;
    }
    public static String insNome() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
        if (nome == null || nome.trim().isEmpty() || nome.length() < 3) {
            msg("Nome incorreto!\nPor favor, digite um nome válido ");
            return insNome();
        }
        return nome;
    }
    public static void msg(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}
