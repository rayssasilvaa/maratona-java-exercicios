package aula.maratonajava.javacore.ZZBcomportamento.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(filter(nums, n -> n % 2 == 0));
    }

   private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }

        return filteredList;
   }
}
