package aula.maratonajava.javacore.Ycolecoes.test;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>();

        set.add("animal");
        set.add("cor");
        set.add("bebida");
        set.add("carro");
        set.add("computador");

        for (String elemento : set) {
            System.out.println(elemento);
        }

        System.out.println(set.first());

        System.out.println(set.last());

        System.out.println(set.ceiling("cor"));

        System.out.println(set.floor("cor"));

        System.out.println(set.higher("cor"));

        System.out.println(set.lower("cor"));

        System.out.println(set.headSet("cor"));

        System.out.println(set.headSet("cor", true));

        System.out.println(set.tailSet("cor"));

        System.out.println(set.tailSet("cor", false));

        System.out.println(set.subSet("bebida", true, "computador", true));
        System.out.println(set.descendingSet());

        System.out.println(set.pollFirst());

        System.out.println(set.pollLast());

        System.out.println(set);
    }
}