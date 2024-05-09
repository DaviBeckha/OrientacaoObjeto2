package acougue_main;

import acougue_OO.Carne;
import acougue_OO.Cliente;
import acougue_OO.OrdenarProdutos;
import acougue_OO.Proprietario;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class CaixaAcougue {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        SimpleDateFormat diaCompra = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat DuasCasas = new SimpleDateFormat("#.##");

        System.out.println("----------DADOS DO PROPRIETÁRIO-----------");
        System.out.print("Nome do proprietário: ");
        String nmProprietario = sc.nextLine();
        System.out.print("Nome do Açougue: ");
        String nmAcougue = sc.nextLine();
        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        Proprietario proprietario = new Proprietario(nmProprietario, nmAcougue, cidade);

        System.out.println("Quantos produtos na loja : ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++){
            System.out.println("Produto #" + (i+1));
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            sc.nextLine();
            System.out.println("Quantiade do produto:");
            Integer qntdProduto = sc.nextInt();
            System.out.println("Código do produto: ");
            String codigoProduto = sc.nextLine();

            Carne carne = new Carne(nomeProduto, precoProduto,codigoProduto);
            OrdenarProdutos carnes = new OrdenarProdutos(qntdProduto,precoProduto,carne);

        }

        System.out.println("----------DADOS DO CLIENTE----------");
        System.out.println("Nome do cliente ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        Integer cpf = sc.nextInt();
        sc.nextLine();
        System.out.print("Seu endereço: ");
        String endereco = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf, endereco);



        int op = 0;
        do {

            System.out.println(menu());
            System.out.println("Oque deseja: ");
            op = sc.nextInt();



            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while (op !=8);

    }
    public static String menu() {
        String menu = "1- Lista de itens\n" +
                "2- Qual item deseja e quantos dele";

        return menu;
    }
}
