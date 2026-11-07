package aula.maratonajava.javacore.ZZClambda.test;

import aula.maratonajava.javacore.ZZClambda.Service.PeopleComparators;
import aula.maratonajava.javacore.ZZClambda.domain.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Pessoa> list = new ArrayList<>(List.of(
            new Pessoa("Rayssa", 20),
                new Pessoa("Cassia", 53),
                new Pessoa("Fabiano", 47),
                new Pessoa("Paula", 26)
        ));

     //   Collections.sort(list, SerieComparators::compareByAlfabetic);
        Collections.sort(list, PeopleComparators::compareByAge);
        System.out.println(list);
    }
}
