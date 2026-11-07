package aula.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String name;
    private Jogador[] jogadores;

    public Time(String name) {
        this.name = name;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.name = name;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println(this.name);
        if (jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getName());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }
}
