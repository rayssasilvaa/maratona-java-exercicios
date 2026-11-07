package aula.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> series = new ArrayList<>(6);

        series.add("The Big Bang Teory");

        Collections.sort(series);

        for (String s : series) {
            System.out.println(s);
        }
    }
}
