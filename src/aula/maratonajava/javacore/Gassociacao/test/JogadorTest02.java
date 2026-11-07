package aula.maratonajava.javacore.Gassociacao.test;

import aula.maratonajava.javacore.Gassociacao.dominio.Jogador;
import aula.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Aspas");
        Time nomeDoTime = new Time("MIBR");

        jogador1.setTime(nomeDoTime);
        jogador1.imprime();
    }
}
