package aula.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("pasta/novo.txt");

        // LEITURA
        BasicFileAttributes basicFileAttributes =
                Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);
        System.out.println("lastAccessTime: " + lastAccessTime);

        System.out.println("--------------------------------");

        // ALTERACAO
        BasicFileAttributeView basicFileAttributeView =
                Files.getFileAttributeView(path, BasicFileAttributeView.class);

        FileTime newLastAccessTime =
                FileTime.fromMillis(System.currentTimeMillis());

        basicFileAttributeView.setTimes(
                null,
                newLastAccessTime,
                null
        );

        // LE NOVAMENTE
        basicFileAttributes = basicFileAttributeView.readAttributes();

        System.out.println("Depois da alteração:");

        System.out.println("creationTime: " +
                basicFileAttributes.creationTime());

        System.out.println("lastModifiedTime: " +
                basicFileAttributes.lastModifiedTime());

        System.out.println("lastAccessTime: " +
                basicFileAttributes.lastAccessTime());
    }
}