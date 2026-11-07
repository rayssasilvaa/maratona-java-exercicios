package aula.maratonajava.intoducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Java";
        nomes[1] = "JavaScript";
        nomes[2] = "C++";
        nomes[3] = "Python";

        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);
        }
    }
}
