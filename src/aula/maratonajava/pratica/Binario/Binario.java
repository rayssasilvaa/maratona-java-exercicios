package aula.maratonajava.pratica.Binario;

import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String res;

        do {
            System.out.println("Insira um numero para converte-lo em binario: ");
            int n = input.nextInt();

            String binario = " ";

            while (n > 0) {
                int resto = n % 2;
                binario = resto + binario;
                n = n / 2;
            }

            System.out.println("Numero em binario: " + binario);

            System.out.println("Deseja realizar outra convesao? S/N");
            res = input.next();

        } while (res.equalsIgnoreCase("S"));

        System.out.println("Programa encerrado!");
        input.close();
    }

}
