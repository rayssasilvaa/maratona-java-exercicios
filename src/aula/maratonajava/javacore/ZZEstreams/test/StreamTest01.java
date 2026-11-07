package aula.maratonajava.javacore.ZZEstreams.test;

import aula.maratonajava.javacore.ZZEstreams.domain.Hq;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<Hq> hqs = new ArrayList<>(List.of(
            new Hq("Crisis on Infinite Earths", 5.25),
            new Hq("The Flash", 8.90),
            new Hq("Batman", 4.90),
            new Hq("Superman", 6.00),
            new Hq("Wonder Woman", 4.50)
    ));

    public static void main(String[] args) {
        System.out.println("Before sort: ");
        System.out.println(hqs);

        hqs.sort(Comparator.comparing(Hq::getPrice));
        List<String> titles = new ArrayList<>();

        for (Hq hq : hqs){
            if (hq.getPrice() <= 5){
                titles.add(hq.getTitle());
            }

            if (titles.size() >=3){
                break;
            }
        }

        System.out.println("\nLast sort: (byPrice)");
        System.out.println(hqs);

        System.out.println("\nRetrieve the first 3 titles HQ with price less 5");
        System.out.println(titles);
    }
}
