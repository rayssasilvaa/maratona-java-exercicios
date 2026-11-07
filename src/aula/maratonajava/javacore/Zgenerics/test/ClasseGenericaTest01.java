package aula.maratonajava.javacore.Zgenerics.test;

import aula.maratonajava.javacore.Zgenerics.Service.CarroRentavelService;
import aula.maratonajava.javacore.Zgenerics.domain.Carro;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.retrieveAvailableCar();
        System.out.println(carro);

        System.out.println("===============");

        carroRentavelService.retornarCarroAlugado(carro);
    }

}
