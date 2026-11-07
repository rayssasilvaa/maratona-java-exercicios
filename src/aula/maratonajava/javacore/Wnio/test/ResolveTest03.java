package aula.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/user");
        Path arquivo = Paths.get("dev/arquivo.txt");

        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);
    }
}
