package aula.maratonajava.intoducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 20;
        int soma = n1 + n2;
        System.out.println("A soma é " + soma);

        int resto = 20 % 2;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);

        int age = 35;
        float salary = 3500F;
        boolean isTrue = age > 30 && salary > 4612;
        boolean isFalse = age < 30 && salary < 3318;
        System.out.println(isTrue);
        System.out.println(isFalse);

        double currentAccount = 200;
        double savingsAccount = 6000;
        float playstationValue = 3000;
        boolean isBuyPlaystation = currentAccount > playstationValue || savingsAccount > playstationValue;
        System.out.println(isBuyPlaystation);

        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
    }
}
