package aula.maratonajava.javacore.ZZClambda.Service;

import aula.maratonajava.javacore.ZZClambda.domain.Pessoa;

public class PeopleComparators {
    public static int compareByAlfabetic(Pessoa s1, Pessoa s2){
        return s1.getName().compareTo(s2.getName());
    }

    public static int compareByAge(Pessoa s1, Pessoa s2){
        return Integer.compare(s1.getAge(), s2.getAge());
    }

    public int compareByAgeNonStatic(Pessoa s1, Pessoa s2){
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
