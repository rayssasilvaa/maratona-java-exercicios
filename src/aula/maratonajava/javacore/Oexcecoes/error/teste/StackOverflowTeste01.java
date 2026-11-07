package aula.maratonajava.javacore.Oexcecoes.error.teste;

public class StackOverflowTeste01 {
    public static void main(String[] args) {
        rescursividade();
    }

    public static void rescursividade() {
        rescursividade();
    }
}
