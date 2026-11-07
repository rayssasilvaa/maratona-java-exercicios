package aula.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Rayssa";
        String nome2 = "Rayssa";

        nome1 = nome1.concat(" Silva");
        System.out.println(nome1);

        if (nome1 == nome2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}
