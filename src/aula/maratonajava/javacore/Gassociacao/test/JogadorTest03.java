package aula.maratonajava.javacore.Gassociacao.test;

import aula.maratonajava.javacore.Gassociacao.dominio.Jogador;
import aula.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Zekken");
        Jogador jogador2 = new Jogador("Aspas");
        Time time = new Time("MIBR");
        Jogador[] jogadores = {jogador, jogador2};


        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
