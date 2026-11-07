package aula.maratonajava.javacore.ZZEstreams.test;

import aula.maratonajava.javacore.ZZEstreams.domain.Hq;
import aula.maratonajava.pratica.StreamsPratica.Books;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<Hq> hqs = new ArrayList<>(List.of(
            new Hq("Crisis on Infinite Earths", 5.25),
            new Hq("The Flash", 8.90),
            new Hq("Batman", 4.90),
            new Hq("Superman", 6.00),
            new Hq("Wonder Woman", 4.50)
    ));

    public static void main(String[] args) {

        List<String> titles = hqs
                .stream()
                .sorted(Comparator.comparing(Hq::getTitle))
                .filter(hq -> hq.getPrice() <= 6)
                .limit(3)
                .map(Hq::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
