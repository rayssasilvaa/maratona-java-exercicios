package aula.maratonajava.intoducao;

/*
 * Exercicio
 *
 * Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 *
 * eu <nome>, morando no endereço <endereço>,
 * confirmo que recebi o salario <salario>, na data <data>
 * */


public class Aula03Exercicios {
    public static void main(String[] args) {
        String name = "Rayssa";
        String address = "Rua dos Palmares";
        double salary = 2500.0;
        String dateSalary = "12.06.2026";
        String message = ("I " + name + ", " + "living at address " + address + ", " + "I confirm that I received my salary " + salary + " on date " + dateSalary);

        System.out.println(message);
    }
}
