package aula.maratonajava.pratica.Pedidos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            PedidoService pedidos = new PedidoService();

            pedidos.executar(input);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Sistema finalizado!");
        }
    }
}
