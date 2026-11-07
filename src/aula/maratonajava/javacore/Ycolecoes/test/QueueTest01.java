package aula.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();

        fila.add("C");
        fila.add("A");
        fila.add("B");

        for (String f : fila){
            System.out.println(f);
        }
    }
}
