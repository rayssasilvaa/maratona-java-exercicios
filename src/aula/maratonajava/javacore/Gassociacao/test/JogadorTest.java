package aula.maratonajava.javacore.Gassociacao.test;

import aula.maratonajava.javacore.Gassociacao.dominio.Jogador;
import aula.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Aspas");
        Jogador jogador2 = new Jogador("Zekken");
        Jogador jogador3 = new Jogador("Verno");
        Jogador jogador4 = new Jogador("Tex");
        Jogador jogador5 = new Jogador("Mazino");
        Time nomeDoTime = new Time("MIBR");

        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4, jogador5};
        jogador5.setTime(nomeDoTime);

        for (Jogador j : jogadores) {
            j.imprime();
        }

    }
}
