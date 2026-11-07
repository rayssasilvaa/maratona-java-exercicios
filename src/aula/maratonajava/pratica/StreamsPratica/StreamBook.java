package aula.maratonajava.pratica.StreamsPratica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBook {
    public static List<Books> books = new ArrayList<>(List.of(
            new Books("O Lado feio do amor", 40.50),
            new Books("A Hipotese da Simulação", 39.99),
            new Books("Como manter a mente sã", 45.19),
            new Books("A razão do amor", 50.00),
            new Books("A Hipotese do amor", 29.00)
    ));


    public static void main(String[] args) {

        List<String> list = books
                .stream()
                .sorted(Comparator.comparing(Books::getTitleBook))
                .filter(b -> !b.getTitleBook().startsWith("A"))
                .limit(3)
                .map(Books::getTitleBook)
                .collect(Collectors.toList());


        List<String> list1 = books
                .stream()
                .sorted(Comparator.comparing(Books::getPrice))
                .filter(b ->b.getPrice() <= 45)
                .map(Books::getTitleBook)
                .collect(Collectors.toList());

        System.out.println(list1);
    }
}
