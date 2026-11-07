package aula.maratonajava.javacore.ZZDoptional.test;

import aula.maratonajava.javacore.ZZDoptional.cardapio.Cardapio;
import aula.maratonajava.javacore.ZZDoptional.domain.Comida;

import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {

        Optional<Comida> comidaList = Cardapio.findByName("Chease Burguer");
        comidaList.ifPresent(c -> c.setNome("Chease Bacon Burguer"));

        System.out.println(comidaList);


    }
}
