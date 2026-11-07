package aula.maratonajava.javacore.Aclasses.test;

import aula.maratonajava.javacore.Aclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.name = "Nissan";
        carro1.model = "GT-R 35";
        carro1.year = 2017;

        carro2.name = "Mitsubishi";
        carro2.model = "Lancer GT";
        carro2.year = 2012;

        carro1 = carro2;

        System.out.println(carro2.name + " " + carro2.model + " " + carro2.year);
        System.out.println(carro1.name + " " + carro1.model + " " + carro1.year);


    }
}
