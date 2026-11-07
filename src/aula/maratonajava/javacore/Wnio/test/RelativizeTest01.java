package aula.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/user");
        Path clazz = Paths.get("/home/user/devJava/OlaMundo.java");

        Path pathToClazz = dir.relativize(clazz);

        System.out.println(pathToClazz);
    }
}
