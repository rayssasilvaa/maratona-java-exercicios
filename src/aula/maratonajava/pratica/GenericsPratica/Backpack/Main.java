package aula.maratonajava.pratica.GenericsPratica.Backpack;

public class Main {
    public static void main(String[] args) {
        Backpack<Object> backpack = new Backpack<>();

        backpack.addItems(new Phone("Phone"));
        backpack.addItems(new Book("Book"));
        backpack.addItems(new WaterBottle("Water Bottle"));

        System.out.println("Itens: ");
        backpack.viewItems();

    }
}
