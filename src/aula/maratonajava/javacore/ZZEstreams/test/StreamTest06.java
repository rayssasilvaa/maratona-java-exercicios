package aula.maratonajava.javacore.ZZEstreams.test;

import aula.maratonajava.javacore.ZZEstreams.domain.Hq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest06 {
    public static List<Hq> hqs = new ArrayList<>(List.of(
            new Hq("The Flash", 1.25),
            new Hq("Batman", 2.00),
            new Hq("Superman", 1.50),
            new Hq("Wonder Woman", 2.55)
    ));

    public static void main(String[] args) {
        System.out.println(hqs.stream().anyMatch(hq -> hq.getPrice() > 2));
        System.out.println(hqs.stream().allMatch(hq -> hq.getPrice() > 0));
        System.out.println(hqs.stream().noneMatch(hq -> hq.getPrice() > 3));

        hqs.stream()
                .filter(hq -> hq.getPrice() > 1)
                .findAny()
                .ifPresent(System.out::println);

        hqs.stream()
                .filter(hq -> hq.getPrice() > 1)
                .sorted(Comparator.comparing(Hq::getPrice))
                .findFirst()
                .ifPresent(System.out::println );

    }
}
