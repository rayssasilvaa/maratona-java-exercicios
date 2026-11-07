package aula.maratonajava.pratica.Adega;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adega<T extends Produtos> {
   private final List<T> items = new ArrayList<>();
   private final Scanner input = new Scanner(System.in);

    static {
        System.out.println("====================================================");
        System.out.println("                    AVISOS");
        System.out.println("====================================================");
        System.out.println("Bebidas alcoólicas são proibidas para menores de 18 anos.");
        System.out.println("====================================================");
    }


    public void add(T produto){
        items.add(produto);
    }

    public void date(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataDaVenda = dateTime.format(dateTimeFormatter);

        System.out.println(dataDaVenda);
    }


    public void exibir(){
        for (T  i : items){
            System.out.println("Produto: " + i.getBebida());
            System.out.printf("Valor: R$ %.2f%n", i.getValor());
            System.out.println("Categoria: " + i.getCategoriaBebida());
        }
    }

    public double calcularTotal(){
        double total = 0;

        for (T i : items){
            total += i.getValor();
        }

        return total;
    }

    public void calcularTroco() {
        try  {
            double total = calcularTotal();

            System.out.println("Digite o valor pago: ");
            double valorPago = input.nextDouble();

            if (valorPago < total) {
                System.out.println("Valor insuficiente.");
                return;
            }

            double troco = valorPago - total;

            System.out.printf("Total: R$ %.2f%n", total);
            System.out.printf("Pago: R$ %.2f%n", valorPago);
            System.out.printf("Troco: R$ %.2f%n", troco);
        } catch (Exception e){
            e.printStackTrace();
        }


    }

    public void executar() {
        System.out.println();
        System.out.println("                    VENDA");
        System.out.println("----------------------------------------------------");

        date();
        exibir();

        System.out.println("----------------------------------------------------");


        System.out.printf("Total: R$ %.2f%n", calcularTotal());
        calcularTroco();
    }
}


