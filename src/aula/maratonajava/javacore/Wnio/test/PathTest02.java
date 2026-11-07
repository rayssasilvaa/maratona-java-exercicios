package aula.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("C:\\Users\\Rayssa\\JavaProjects\\maratona-java\\arquivo"); //new File("arquivo")
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

        Path subPastaPath = Paths.get("arquivo/java");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);

        Path filePath = Paths.get(subPastaPath.toString(), "java.txt");
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
            System.out.println("Arquivo criado!");
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "javaScript.txt");

        Files.copy(source, target);
    }
}
