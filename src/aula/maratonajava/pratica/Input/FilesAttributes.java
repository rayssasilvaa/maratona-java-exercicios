package aula.maratonajava.pratica.Input;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FilesAttributes {
    public static void basicFileAttributes() throws IOException {
        Path file = Paths.get("C:\\Users\\Rayssa\\JavaProjects\\maratona-java\\arquivo\\helloWorld.txt");

        if (Files.notExists(file)) {
            Files.createFile(file);
            System.out.println("Arquivo criado!");

            try (FileWriter escreverArquivo = new FileWriter(file.toFile())) {
                escreverArquivo.write("Hello World!!!");
            } catch (IOException e) {
                throw new RuntimeException("Erro ao escrever!!");
            }

        } else {
            throw new IOException("Arquivo existente!!");
        }

        LocalDateTime data = LocalDateTime.now().minusYears(48);
        FileTime ft = FileTime.from(data.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(file, ft);

    }


    public static void main(String[] args) throws IOException {
        basicFileAttributes();
    }
}
