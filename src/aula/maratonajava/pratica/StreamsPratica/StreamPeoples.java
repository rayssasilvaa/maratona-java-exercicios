package aula.maratonajava.pratica.StreamsPratica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeoples {
    public static List<People> people = new ArrayList<>(List.of(
            new People("Paula", 26, "Red"),
            new People("Ana", 19, "Black"),
            new People("Mel", 16, "Pink"),
            new People("Pedro", 9, "Green"),
            new People("Rayssa", 20, "Blue")
    ));

    public static void main(String[] args) {
        for (People p : people){
            System.out.println(p);
            System.out.println("--------------------------------------");
        }

        List<String> printList = people
                .stream()
                .filter(n -> n.getAge() > 18)
                .map(People::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(printList);


    }
}

