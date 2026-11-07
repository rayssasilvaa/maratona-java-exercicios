package aula.maratonajava.pratica.GenericsPratica.Backpack;

public class WaterBottle {
    private String name;

    public WaterBottle(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
