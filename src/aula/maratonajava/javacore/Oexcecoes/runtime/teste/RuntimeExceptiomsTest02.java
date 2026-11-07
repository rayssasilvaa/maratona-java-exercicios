package aula.maratonajava.javacore.Oexcecoes.runtime.teste;

import java.io.IOException;

public class RuntimeExceptiomsTest02 {
    public static void main(String[] args) throws IOException {
        try {
            divisao(1, 6);
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }

    private static int divisao(int a, int b) throws IOException {
        if (b == 0) {
            throw new IllegalArgumentException("Numero invalido");
        }
        return a / b;
    }
}
