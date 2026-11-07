package aula.maratonajava.javacore.Ycolecoes.test;

import aula.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import aula.maratonajava.javacore.Ycolecoes.domain.Series;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Rayssa");
        Consumidor c2 = new Consumidor("Ingrid");

        Series s1 = new Series(1L, "The Big Bang Teory", 755);
        Series s2 = new Series(3L, "Grey's Anatomy", 912);
        Series s3 = new Series(2L, "Supernatural", 752);

        Map<Consumidor, Series> seriesMap = new HashMap<>();

        seriesMap.put(c1, s1);
        seriesMap.put(c2, s3);

        for (Map.Entry<Consumidor, Series> entry : seriesMap.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
