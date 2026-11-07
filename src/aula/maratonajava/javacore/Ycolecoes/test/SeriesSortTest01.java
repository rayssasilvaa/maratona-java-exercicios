package aula.maratonajava.javacore.Ycolecoes.test;

import aula.maratonajava.javacore.Ycolecoes.domain.Series;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeriesSortTest01 {
    public static void main(String[] args) {
        List<Series> series = new ArrayList<>();
        series.add(new Series(1L, "The Big Bang Teory", 755));
        series.add(new Series(3L, "Grey's Anatomy", 912));
        series.add(new Series(2L, "Supernatural", 752));


        for (Series s : series) {
            System.out.println(s);
        }

        Collections.sort(series);

        System.out.println("==========================================");
        for (Series ss : series) {
            System.out.println(ss);
        }
    }
}
