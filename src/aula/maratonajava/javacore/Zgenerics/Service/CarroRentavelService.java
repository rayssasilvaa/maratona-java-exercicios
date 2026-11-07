package aula.maratonajava.javacore.Zgenerics.Service;

import aula.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carros = new ArrayList<>(List.of(new Carro("GT-R"), new Carro("Civic"), new Carro("Lancer")));

    public Carro retrieveAvailableCar(){
        System.out.println("Buscando carro disponivel...");
        Carro carro = carros.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponivel para alugar: " + carros);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro: " + carro);
        carros.add(carro);
        System.out.println("Carros disponiveis para alugar: " + carros);
    }

}
