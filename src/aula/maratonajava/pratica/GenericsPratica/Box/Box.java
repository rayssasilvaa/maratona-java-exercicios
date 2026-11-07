package aula.maratonajava.pratica.GenericsPratica.Box;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private List<T> items = new ArrayList<>();

    public Box(){
        this.items = items;
    }

    public void addItem(T item){
        items.add(item);
    }

    public void viewItem(){
        for (T i : items){
            System.out.println(i);
        }
    }

}

class ObjectItem{
    private final String name;
    private final int quantity;

    public ObjectItem(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return
                "Object: " + name
                        + " - " +
                        "Quantity: " + quantity;
    }
}
