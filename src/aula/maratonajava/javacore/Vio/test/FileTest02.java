package aula.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {

        File arquivo = new File("arquivo");
        boolean isFolder = arquivo.mkdir();

        File java = new File(arquivo, "java.txt");
        try {
            java.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File c = new File(arquivo, "c.txt");
        java.renameTo(c);
    }
}