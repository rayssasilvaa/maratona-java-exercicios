package aula.maratonajava.javacore.ZZEstreams.test;

import aula.maratonajava.javacore.ZZEstreams.domain.Hq;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<Hq> hqs = new ArrayList<>(List.of(
            new Hq("Crisis on Infinite Earths", 5.25),
            new Hq("The Flash", 8.90),
            new Hq("Batman", 4.90),
            new Hq("Superman", 6.00),
            new Hq("Wonder Woman", 4.50)
    ));

    public static void main(String[] args) {
        Stream<Hq> stream = hqs.stream();
        hqs.stream().forEach(System.out::println);

        long count = stream
                .distinct()
                .filter(hq -> hq.getPrice() < 5)
                .count();

        System.out.println(count);
     }
}
