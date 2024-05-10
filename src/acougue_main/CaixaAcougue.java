package acougue_main;

import acougue_OO.*;
import pedido_do_cliente_OO.OrdenarItem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class CaixaAcougue {

    private static OrdemGeral ordemGeral = new OrdemGeral (new Date());
    private static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {

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

        sc.nextLine();

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

            // Possui os produtos em estoque.


        for (int i = 0; i < x; i++){
            System.out.println("Produto #" + (i+1));
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            sc.nextLine();
            System.out.println("Quantiade do produto:");
            Integer qntdProduto = sc.nextInt();
            sc.nextLine();
            System.out.println("Código do produto: ");
            String codigoProduto = sc.nextLine();

            Carne carne = new Carne(nomeProduto, precoProduto,codigoProduto);
            OrdenarProdutos carnes = new OrdenarProdutos(qntdProduto,precoProduto,carne);

            ordemGeral.addItem(carnes);

        }
        int op = 0;


        OrdemGeralVenda compras = new OrdemGeralVenda(new Date(),cliente);

        do {

            System.out.println(menu());
            System.out.println("Oque deseja: ");
            op = sc.nextInt();





            switch (op) {
                case 1:
                    System.out.println(ordemGeral.toString(false));
                    break;
                case 2:
                    compraItem(compras);
                    break;
                case 3:
                    System.out.println(compras.toString());
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

    private static void compraItem(OrdemGeralVenda compras) {
        sc.nextLine();
        System.out.println("Digite os código do item: ");
        String codigo = sc.nextLine();
        OrdenarProdutos ordenarProdutos = ordemGeral.getItemByCodigo(codigo);
        if (isNull(ordenarProdutos)) {
            System.out.println("Produto não encontrado.");
        } else {
            System.out.println(ordenarProdutos.toString(false));
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine();
            if (quantidade > ordenarProdutos.getQuantidade()) {
                System.out.println("Quantidade indisponível.");
            } else {
                ordenarProdutos.setQuantidade(ordenarProdutos.getQuantidade() - quantidade);
                compras.addItem(new OrdenarProdutos(quantidade, ordenarProdutos.getPreco(), ordenarProdutos.getProduto()));
            }
        }
    }

    public static String menu() {
        String menu = "1- Lista de itens\n" +
                "2- Qual item deseja e quantos dele";

        return menu;
    }
}
