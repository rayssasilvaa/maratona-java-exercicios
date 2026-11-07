package aula.maratonajava.javacore.ZZDoptional.cardapio;

import aula.maratonajava.javacore.ZZDoptional.domain.Comida;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Cardapio {
     private static List<Comida> menu = List.of(
             new Comida(1, "Chease Burguer", 18.90),
             new Comida(2, "Chease Bacon", 20.50),
             new Comida(3, "Chicken Burguer", 30.00)
             );

     public static Optional<Comida> findBy(Predicate<Comida> predicate){
         Comida found = null;

         for (Comida c : menu){
             if (predicate.test(c)){
                 found = c;
             }
         }

         return Optional.ofNullable(found);
     }

     public static Optional<Comida> findByName(String nome){
         return findBy(c -> c.getNome().equals(nome));
     }

     private static Optional<Comida> findById(Integer id){
         return findBy(c -> c.getId().equals(id));
     }
}
