package aula.maratonajava.pratica.Adega;

import java.util.Scanner;

public class VerIdade {
    private CategoriaBebida categoriaDeBebidas;

    public VerIdade() {
        this.categoriaDeBebidas = categoriaDeBebidas;
    }

    public void verificar() {
        System.out.println("-----------------------------------------------------");
        try (Scanner input = new Scanner(System.in);) {
            if (categoriaDeBebidas.equals(CategoriaBebida.BEBIDA_ALCOOLICA)) {

                System.out.println("Insira sua idade para realizar a compra: ");
                int idade = input.nextInt();
                System.out.println("idade: " + idade);

                if (idade < 1) {
                    throw new RuntimeException("idade invalida");
                }

                if (idade < 18) {
                    System.out.println("Venda proibida!");
                } else {
                    System.out.println("Venda liberada!");
                }
            } else {
                System.out.println("Compra finalizada! Obrigada.");
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
