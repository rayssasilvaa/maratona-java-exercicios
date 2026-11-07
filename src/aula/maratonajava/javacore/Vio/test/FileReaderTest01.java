package aula.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Rayssa\\IdeaProjects\\maratona-java\\arquivo\\teste.txt");

        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print(i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
