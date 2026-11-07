package aula.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("arquivo/arquivo.zip");
        Path pathZip = Paths.get("arquivo/teste.txt");
        zip(path, pathZip);
    }

    private static void zip(Path path, Path pathZip) {
        try (ZipOutputStream zip = new ZipOutputStream(Files.newOutputStream(path));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(pathZip);
        ) {
            for (Path file : directoryStream) {
                System.out.println(file.getFileName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
