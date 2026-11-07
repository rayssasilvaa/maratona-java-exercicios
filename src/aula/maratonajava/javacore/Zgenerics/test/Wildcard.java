package aula.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

abstract class Animal{
    abstract void info();
}

class Gato extends Animal{
    @Override
    public void info(){
        System.out.println("Gato");
    }
}

class Cachorro extends Animal{
    @Override
    public void info(){
        System.out.println("Cachorro");
    }
}

public class Wildcard {

    private static void printAnimal(List<? extends Animal> animals){
        for (Animal animal : animals){
            animal.info();
        }
    }

    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printAnimal(cachorros);
        printAnimal(gatos);

    }
}
