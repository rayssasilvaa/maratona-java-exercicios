package aula.maratonajava.javacore.FmodificadorEstatico.test;

import aula.maratonajava.javacore.FmodificadorEstatico.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BWM", 270);
        Carro c2 = new Carro("Audi", 260);
        Carro c3 = new Carro("Lancer", 265);

        Carro.setVelLimite(212);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
