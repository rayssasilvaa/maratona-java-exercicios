package aula.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(10);

        Path path = Paths.get("C:\\Users\\Rayssa\\JavaProjects\\maratona-java\\arquivo\\java.txt");
        Files.createFile(path);

        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
    }
}
