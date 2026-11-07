package aula.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Rayssa\\IdeaProjects\\maratona-java\\arquivo\\arquivo.txt");

        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Estou aprendendo Java!");
            bw.flush();
        } catch (IOException e) {
            System.out.println("ERRO");
            e.printStackTrace();
        }
    }
}
