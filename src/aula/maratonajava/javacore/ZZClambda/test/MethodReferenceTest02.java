package aula.maratonajava.javacore.ZZClambda.test;

import aula.maratonajava.javacore.ZZClambda.Service.PeopleComparators;
import aula.maratonajava.javacore.ZZClambda.domain.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        PeopleComparators peopleComparators = new PeopleComparators();
        List<Pessoa> list = new ArrayList<>(List.of(
                new Pessoa("Derek", 22),
                new Pessoa("Simon", 19),
                new Pessoa("Klaus", 73)
        ));
        list.sort(peopleComparators::compareByAgeNonStatic);

        System.out.println(list);
    }
}
