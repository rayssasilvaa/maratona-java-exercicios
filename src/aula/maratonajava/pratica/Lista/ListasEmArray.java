package aula.maratonajava.pratica.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListasEmArray {
    public static void arrayString() {
        List<String> nomes = new ArrayList<>();
        int total = 5;

        nomes.add("Rayssa");
        nomes.add("Ingrid");
        nomes.add("Helena");
        nomes.add("Hariel");

        if (nomes.size() < total) {
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Adicione +1 nome: ");
                String nome = input.nextLine();

                if (nomes.contains(nome)) {
                    System.out.println("Nome existente!");
                } else {
                    nomes.add(nome);
                    for (String n : nomes) {
                        System.out.println(n);

                    }
                }


            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void arrayInteger() {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(0);

        if (numeros.size() < 2) {
            for (int i = 0; i < 10; i++) {
                numeros.add(1);
                numeros.add(0);
                System.out.println(numeros);
            }
        }
    }

    public static void main(String[] args) {
        arrayString();
        // System.out.println("======================================");
        //arrayInteger();
    }
}
