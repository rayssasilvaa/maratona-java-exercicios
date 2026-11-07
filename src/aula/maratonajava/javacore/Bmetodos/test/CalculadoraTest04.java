package aula.maratonajava.javacore.Bmetodos.test;

import aula.maratonajava.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int idadeEmDezAnos = 30;
        int ano = 2036;
        calculadora.alteraDoisNumero(idadeEmDezAnos, ano);
        System.out.println("Daqui a 10 anos a idade sera " + idadeEmDezAnos);
        System.out.println("Dez anos no futuro sera " + ano);
    }
}
