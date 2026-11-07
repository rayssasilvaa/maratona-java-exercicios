package aula.maratonajava.javacore.ZZEstreams.test;

import aula.maratonajava.javacore.ZZEstreams.domain.Hq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> word = List.of("Made", "In", "Brasil");

        List<String> letters = word.stream()
                .map(words -> words.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(letters);
    }
}
