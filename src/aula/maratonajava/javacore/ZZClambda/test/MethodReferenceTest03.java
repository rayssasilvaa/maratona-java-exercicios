package aula.maratonajava.javacore.ZZClambda.test;

import aula.maratonajava.javacore.ZZClambda.Service.PeopleComparators;
import aula.maratonajava.javacore.ZZClambda.domain.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Zacke", "Paula", "Ana"));
        list.sort(String::compareTo);

        System.out.println(list);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));
    }
}
