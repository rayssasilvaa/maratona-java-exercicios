package aula.maratonajava.pratica.GenericsPratica.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();

        try(Scanner input = new Scanner(System.in)){
            System.out.println("Input object name: ");
            String objName = input.next();

            System.out.println("Input object quantity: ");
            int objQnt = input.nextInt();

            objectBox.addItem(new ObjectItem(objName, objQnt));

            System.out.println("Object added:");

            objectBox.viewItem();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
