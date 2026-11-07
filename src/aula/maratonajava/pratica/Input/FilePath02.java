package aula.maratonajava.pratica.Input;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FilePath02 {

    public static void register() throws IOException {

        Path arquivo = Paths.get("C:\\Users\\Rayssa\\JavaProjects\\maratona-java\\arquivo\\register.txt");

        if (Files.exists(arquivo)) {
            System.out.println("Arquivo existente!");
            return;
        }

        Scanner input = new Scanner(System.in);

        System.out.println("===REGISTRO===");

        System.out.println("Nome:");
        String nomeInput = input.nextLine();

        System.out.println("Data de Nascimento:");
        String dataInput = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataInput, formatter);

        if (data.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException(
                    "Data inválida!"
            );
        }

        Files.createFile(arquivo);

        try (FileWriter fw = new FileWriter(arquivo.toFile())) {

            fw.write("Nome: " + nomeInput + "\n");
            fw.write("Data de Nascimento: " + dataInput + "\n");
        }

        FileTime fileTime = FileTime.from(data.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Files.setLastModifiedTime(arquivo, fileTime);

        System.out.println("Registro criado!");

        input.close();
    }

    public static void main(String[] args) throws IOException {
        register();
    }
}