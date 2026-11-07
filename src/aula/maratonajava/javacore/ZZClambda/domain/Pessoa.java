package aula.maratonajava.javacore.ZZClambda.domain;

public class Pessoa {
    private String name;
    private int age;

    public Pessoa(String nome, int age){
        this.name = nome;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
