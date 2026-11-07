package aula.maratonajava.pratica.GenericsPratica.Backpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack<T> {
    //Inicializando Array
    private List<T> items = new ArrayList<>();

    public Backpack() {
         this.items = items;
    }

    //Colocar itens no Array
    public void addItems(T item){
        items.add(item);
    }

    //Mostrar itens
    public void viewItems(){
        for (T i : items){
            System.out.println(i);
        }
    }
}
