package aula.maratonajava.javacore.Ycolecoes.test;

import aula.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("12RA", "iPhone");
        Smartphone s2 = new Smartphone("19IG", "Sansung");
        Smartphone s3 = new Smartphone("17RI", "Motolora");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone s : smartphones) {
            System.out.println(s);
        }
    }
}
