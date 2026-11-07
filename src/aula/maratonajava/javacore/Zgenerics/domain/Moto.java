package aula.maratonajava.javacore.Zgenerics.domain;

public class Moto {
    private String name;

    public Moto(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Motos{" +
                "name='" + name + '\'' +
                '}';
    }
}
