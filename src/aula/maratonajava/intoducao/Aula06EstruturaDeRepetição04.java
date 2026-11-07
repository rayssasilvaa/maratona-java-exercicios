package aula.maratonajava.intoducao;

public class Aula06EstruturaDeRepetição04 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
