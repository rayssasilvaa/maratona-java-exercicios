package aula.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println("ArrayList: " + numeros);

        Integer[] listToArray = numeros.toArray(numeros.toArray(new Integer[0]));
        System.out.println("Array: " + Arrays.toString(listToArray));

        Integer[] n = new Integer[3];
        n[0] = 1;
        n[1] = 2;
        n[2] = 3;

        List<Integer> arrayToList = Arrays.asList(n);
        System.out.println(Arrays.toString(n));
        System.out.println(arrayToList);
    }

}
