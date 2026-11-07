package aula.maratonajava.javacore.Zgenerics.test;

import aula.maratonajava.javacore.Zgenerics.Service.RentalService;
import aula.maratonajava.javacore.Zgenerics.domain.Carro;
import aula.maratonajava.javacore.Zgenerics.domain.Moto;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> availableCar = new ArrayList<>(List.of(new Carro("GTR"), new Carro("Civic")));
        List<Moto> availableMotos = new ArrayList<>(List.of(new Moto("Honda"), new Moto("BMW")));

        RentalService<Carro> rentalService = new RentalService<>(availableCar);

        Carro carro = rentalService.retrieveObjectAvailable();
        System.out.println("using the car for a month...");
        rentalService.returnObject(carro);

        System.out.println("======================");

        RentalService<Moto> rentalService1 = new RentalService<>(availableMotos);

        Moto moto = rentalService1.retrieveObjectAvailable();
        System.out.println("using the motorcycle for a month...");
        rentalService1.returnObject(moto);
    }

}
