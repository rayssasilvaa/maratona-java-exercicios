package aula.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Rayssa\\IdeaProjects\\maratona-java\\arquivo\\arquivo.txt");

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }


        } catch (IOException e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
    }
}
