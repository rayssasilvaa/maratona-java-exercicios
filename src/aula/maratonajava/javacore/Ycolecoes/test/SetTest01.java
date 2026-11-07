package aula.maratonajava.javacore.Ycolecoes.test;

import aula.maratonajava.javacore.Ycolecoes.domain.Series;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Series> series = new HashSet<>();
        series.add(new Series(1L, "The Big Bang Teory", 755));
        series.add(new Series(3L, "Grey's Anatomy", 912));
        series.add(new Series(2L, "Supernatural", 752));

        for (Series serie : series){
            System.out.println(serie);
        }


    }
}
