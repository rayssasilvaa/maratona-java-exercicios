package aula.maratonajava.pratica.GenericsPratica.Backpack;

public class Phone {
    private String name;

    public Phone(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
            return name;
    }
}
