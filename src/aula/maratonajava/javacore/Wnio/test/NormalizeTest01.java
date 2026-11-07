package aula.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/user/file";
        String file = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, file);
        System.out.println("Sem normalize() -> " + path1);
        System.out.println("Com normalize() -> " + path1.normalize());

        System.out.println(" ");

        Path path2 = Paths.get("/home/./user/./dev/");
        System.out.println("Sem normalize() -> " + path2);
        System.out.println("Com normalize() -> " + path2.normalize());
    }
}
