package aula.maratonajava.pratica.Lista;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class ListaTypes {
    public void arrayList(){
        ArrayList<String> cursosArrayList = new ArrayList<>();

        cursosArrayList.add("Ciências da Computação");
        cursosArrayList.add("Direito");
        cursosArrayList.add("Analise de Desenvolvimento de Software");
        cursosArrayList.add("Psicologia");

        System.out.println(cursosArrayList);


        }

    public void hashSet(){
        HashSet<String> cursosHashSet = new HashSet<>();

        cursosHashSet.add("Ciências da Computação");
        cursosHashSet.add("Direito");
        cursosHashSet.add("Analise de Desenvolvimento de Software");
        cursosHashSet.add("Psicologia");

        System.out.println(cursosHashSet);
    }

    public void treeSet(){
        TreeSet<String> cursosTreeSet = new TreeSet<>();

        cursosTreeSet.add("Ciências da Computação");
        cursosTreeSet.add("Direito");
        cursosTreeSet.add("Analise de Desenvolvimento de Software");
        cursosTreeSet.add("Psicologia");

        System.out.println(cursosTreeSet);
    }

    public void treeSetInt(){
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(1);
        numeros.add(10);
        numeros.add(4);
        numeros.add(17);

        System.out.println("Lista original: " + numeros);
        System.out.println("Lista ao contrario: " + numeros.descendingSet());

        System.out.println();
        System.out.println("nunca retornam o próprio elemento, apenas o anterior ou o próximo: ");
        System.out.println("Higher: " + numeros.higher(16));
        System.out.println("Lower: " + numeros.lower(2));

        System.out.println();
        System.out.println("podem retornar o próprio elemento se ele existir: ");
        System.out.println("Floor: " + numeros.floor(14));
        System.out.println("Ceiling: " + numeros.ceiling(1));
    }


}

class main{
    public static void main(String[] args) {
        ListaTypes listas = new ListaTypes();

        //Lista conforme oos elementos foram add
        listas.arrayList();

        //Lista ordenada por ordem alfabetica
        listas.treeSet();

        //Lista aleatoria
        listas.hashSet();
    }
}