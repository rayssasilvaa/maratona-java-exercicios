package aula.maratonajava.javacore.Ycolecoes.test;

import aula.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import aula.maratonajava.javacore.Ycolecoes.domain.Series;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Rayssa");
        Consumidor c2 = new Consumidor("Ingrid");

        Series s1 = new Series(1L, "The Big Bang Teory", 755);
        Series s2 = new Series(3L, "Grey's Anatomy", 912);
        Series s3 = new Series(2L, "Supernatural", 752);
        Series s4 = new Series(4L, "Velozes e Furiosos 5", 1);

        List<Series> seriesList1 = List.of(s1, s2, s3);
        List<Series> seriesList2 = List.of(s3, s4);

        Map<Consumidor, List<Series>>  seriesMap = new HashMap<>();

        seriesMap.put(c1, seriesList1);
        seriesMap.put(c2, seriesList2);

        for(Map.Entry<Consumidor, List<Series>> entry : seriesMap.entrySet()) {
            System.out.println("=================");
            System.out.println(entry.getKey().getNome() + ":");

            for (Series series : entry.getValue()) {

                System.out.println(series.getNome());
            }
        }




    }
}
