package aula.maratonajava.javacore.Ycolecoes.test;

import aula.maratonajava.javacore.Ycolecoes.domain.Series;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Series> series = new ArrayList<>();
        series.add(new Series(1L, "The Big Bang Teory", 755, 2007));
        series.add(new Series(3L, "Grey's Anatomy", 912, 2005));
        series.add(new Series(2L, "Supernatural", 752, 2005));

        Iterator<Series> seriesIterator = series.iterator();
        while (seriesIterator.hasNext()) {
            if (seriesIterator.next().getAno() == 0){
                seriesIterator.remove();
            }
        }

        series.removeIf(s -> s.getAno() == 0);
        System.out.println(series);
    }
}

