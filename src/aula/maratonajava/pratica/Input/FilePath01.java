package aula.maratonajava.pratica.Input;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilePath01 {

    static {
        System.out.println("=== Criando arquivos ===");
    }

    public static void arquivos() {

        try (Scanner input = new Scanner(System.in)) {

            Path filePath = null;

            System.out.println("Você deseja criar um arquivo? S/N");
            String resposta = input.next();

            if (resposta.equalsIgnoreCase("S")) {

                System.out.println("Digite o nome do arquivo:");
                String fileName = input.next();

                filePath = Paths.get(
                        "C:\\Users\\Rayssa\\JavaProjects\\maratona-java\\arquivo\\" + fileName);

                if (Files.notExists(filePath)) {
                    Files.createFile(filePath);
                    System.out.println("Arquivo criado com sucesso!");
                } else {
                    System.out.println("Arquivo já existe!");
                }
            } else {
                System.out.println("Encerrando sistema...");
                return;
            }

            System.out.println("Deseja escrever algo dentro do arquivo? S/N");
            String resposta2 = input.next();

            if (resposta2.equalsIgnoreCase("S")) {

                input.nextLine();

                System.out.println("Digite o conteúdo:");
                String conteudoEscrito = input.nextLine();

                try (FileWriter fw = new FileWriter(filePath.toFile())) {

                    fw.write(conteudoEscrito);

                    System.out.println("Conteúdo escrito com sucesso!");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        arquivos();
    }
}