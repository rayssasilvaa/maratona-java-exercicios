package aula.maratonajava.javacore.Oexcecoes.exception.test;

import aula.maratonajava.javacore.Oexcecoes.exception.domain.Leitor1;
import aula.maratonajava.javacore.Oexcecoes.exception.domain.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 l1 = new Leitor1();
             Leitor2 l2 = new Leitor2()
        ) {


        } catch (IOException e) {

        }
    }
}
