package aula.maratonajava.javacore.Bmetodos.test;

import aula.maratonajava.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumero(20, 2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumero2(5, 0));
        System.out.println("-------------");
        calculadora.printDivisaoDeDoisNumeros(42, 10);
    }
}
