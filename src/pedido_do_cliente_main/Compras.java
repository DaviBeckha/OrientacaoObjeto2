package pedido_do_cliente_main;

import aulas_enum_funcoes_simulado.simulado.enumercao.OrderStatus;
import pedido_do_cliente_OO.Cliente;
import pedido_do_cliente_OO.Ordem;
import pedido_do_cliente_OO.OrdenarItem;
import pedido_do_cliente_OO.Produto;
import pedido_do_cliente_OO.enuM.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Compras {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/HH/yyyy");

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Nome do cliente ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data de aniversário (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Cliente cliente = new Cliente(name, email, birthDate);

        System.out.println("Entre com os dados do pedido ");
        System.out.println("Estado do pedido: ");
        StatusPedido pedido = StatusPedido.valueOf(sc.next());

        Ordem ordem = new Ordem(new Date(), pedido, cliente);

        System.out.println("Quantos itens o pedido vai ter ?");
        int n = sc.nextInt();



        for (int i = 0; i < n; i++) {
            System.out.println("Item da lista #" + (i+1));
            System.out.print("Nome do produto: ");
            String produtoNome = sc.next();
            System.out.print("Preço produto : ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeProduto = sc.nextInt();

            Produto produto = new Produto(produtoNome, precoProduto);
            OrdenarItem item = new OrdenarItem(quantidadeProduto, precoProduto, produto);

            ordem.addItem(item);


        }
        System.out.println();
        System.out.println(ordem);


        sc.close();
    }
}
