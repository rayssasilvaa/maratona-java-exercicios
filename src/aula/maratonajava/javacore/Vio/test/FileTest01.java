package aula.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Rayssa\\IdeaProjects\\maratona-java\\arquivo\\file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);

            boolean exists = file.exists();
            if (exists) {
                System.out.println("Aquivo deletado " + file.delete());
            }

            System.out.println("Caminho do arquivo: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
