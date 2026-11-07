package aula.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Rayssa\\JavaProjects\\maratona-java\\arquivo\\java.txt");
        System.out.println(p1);
        System.out.println(p1.getFileName());
    }
}
