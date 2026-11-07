package aula.maratonajava.javacore.ZZEstreams.test;

import aula.maratonajava.javacore.ZZEstreams.domain.Hq;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest04 {
    private static List<Hq> hqs = new ArrayList<>(List.of(
            new Hq("Crisis on Infinite Earths", 5.25),
            new Hq("The Flash", 8.90),
            new Hq("Batman", 4.90),
            new Hq("Superman", 6.00),
            new Hq("Wonder Woman", 4.50)
    ));

    public static void main(String[] args) {
        System.out.println("Sem Stream: ");
        for (Hq hq : hqs){
            if (hq.getPrice() < 5){
                System.out.println(hq.getTitle());
            }
        }

        System.out.println("\nCom Stream:");
        List<String> hqsList = hqs
                .stream()
                .filter(hq -> hq.getPrice() < 5)
                .map(Hq::getTitle)
                        .limit(3)
                                .collect(Collectors.toList());

        System.out.println(hqsList);

    }
}
