package aula.maratonajava.pratica.Lista;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args){
        TreeMap<Integer, String> alunos = new TreeMap<>();

        alunos.put(1, "Ingrid");
        alunos.put(3, "Rayssa");
        alunos.put(4, "Sacy");
        alunos.put(2, "Aspas");


        System.out.println("Alunos: ");
        for (Map.Entry<Integer, String> entry : alunos.entrySet()){
            System.out.println(entry);
        }

    }
}
