package aula.maratonajava.javacore.Zgenerics.test;

import aula.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public static void main(String[] args) {
        buildArray(new Carro("GTR"));
    }

    private static <T> void buildArray(T t){
        List<T> list = List.of(t);


    }
}
