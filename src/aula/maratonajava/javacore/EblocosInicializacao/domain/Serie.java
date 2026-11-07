package aula.maratonajava.javacore.EblocosInicializacao.domain;

public class Serie {
    private String nome;
    private int[] eps;

    {
        eps = new int[10];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;
        }
    }

    public Serie() {
        for (int ep : this.eps) {
            System.out.println("episodio: " + ep);
        }
    }

    public Serie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return eps;
    }

}

