package aula.maratonajava.javacore.EblocosInicializacao.test;

import aula.maratonajava.javacore.EblocosInicializacao.domain.Serie;

public class SerieTest01 {
    public static void main(String[] args) {
        Serie serie1 = new Serie("TBB");

        for (int ep : serie1.getEpisodios()) {
            System.out.println("ep: " + ep);
        }
    }
}
