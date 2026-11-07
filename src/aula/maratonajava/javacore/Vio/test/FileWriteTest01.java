package aula.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Rayssa\\IdeaProjects\\maratona-java\\arquivo\\file.txt");

        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Hello World!");
            fw.flush(); //forca a escrita imedita no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
