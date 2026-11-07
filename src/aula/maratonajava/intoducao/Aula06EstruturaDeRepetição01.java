package aula.maratonajava.intoducao;

public class Aula06EstruturaDeRepetição01 {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 10) {
            System.out.println("While: " + count);
            count++;
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("for: " + i);
        }
    }
}
