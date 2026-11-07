package aula.maratonajava.javacore.CsobrecargaMetodos.test;

import aula.maratonajava.javacore.CsobrecargaMetodos.dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {
        Serie serie = new Serie();

        serie.init("The Big Bang Theory", "Sit Com", 279, "Sheldon Cooper, Leonard Hofstadter");
        serie.imprime();

    }
}
