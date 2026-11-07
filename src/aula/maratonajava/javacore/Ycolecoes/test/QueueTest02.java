package aula.maratonajava.javacore.Ycolecoes.test;

import aula.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import aula.maratonajava.javacore.Ycolecoes.domain.Series;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Series> series = new PriorityQueue<>();
        series.add(new Series(1L, "The Big Bang Teory", 755));
        series.add(new Series(3L, "Grey's Anatomy", 912));
        series.add(new Series(2L, "Supernatural", 752));

        System.out.println(series);
    }
}
