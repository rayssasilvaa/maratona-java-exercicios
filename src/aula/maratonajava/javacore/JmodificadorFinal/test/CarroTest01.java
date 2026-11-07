package aula.maratonajava.javacore.JmodificadorFinal.test;

import aula.maratonajava.javacore.JmodificadorFinal.domain.Carro;
import aula.maratonajava.javacore.JmodificadorFinal.domain.Gtr;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Bruce");
        System.out.println(carro.COMPRADOR);

        Gtr gtr = new Gtr();
        gtr.setNome("GT-R 35");
        gtr.imprime();
    }
}
