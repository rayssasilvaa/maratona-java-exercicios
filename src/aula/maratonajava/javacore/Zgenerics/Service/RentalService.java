package aula.maratonajava.javacore.Zgenerics.Service;

import aula.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> availableObjects;

    public RentalService(List<T> availableObjects){
        this.availableObjects = availableObjects;
    }

    public T retrieveObjectAvailable(){
        System.out.println("Buscando objeto disponivel...");
        T t = availableObjects.remove(0);
        System.out.println("Alugando Objeto: " + t);
        System.out.println("Objetos disponivel para alugar: " + availableObjects);
        return t;
    }

    public void returnObject(T t){
        System.out.println("Devolvendo objeto: " + t);
        availableObjects.add(t);
        System.out.println("Objetos disponiveis para alugar: " + availableObjects);
    }
}
