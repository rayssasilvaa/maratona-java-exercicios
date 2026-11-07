package aula.maratonajava.pratica.Pedidos;

import java.util.Scanner;

public class PedidoService {
    public void executar(Scanner input) {
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu Whatsapp: ");
        String wpp = input.nextLine();

        Pedido pedido = new Pedido(nome, wpp);

        System.out.println("Escolha a opção do seu pedido: ");
        System.out.println("1 - LANCHE");
        System.out.println("2 - PIZZA");
        System.out.println("3 - ACAI");

        int opcao = input.nextInt();
        input.nextLine();

        switch (opcao) {
            case 1:
                pedido.setTipo(Menu.LANCHE);
                break;
            case 2:
                pedido.setTipo(Menu.PIZZA);
                break;
            case 3:
                pedido.setTipo(Menu.ACAI);
                break;
            default:
                System.out.println("Opção invalida!");
                return;
        }

        System.out.println("Descreva seu pedido: ");
        String item = input.nextLine();

        pedido.setItem(item);
        pedido.resumoDoPedido();
    }
}
