package aula.maratonajava.javacore.FmodificadorEstatico.domain;

public class Serie {
    private String nome;
    private static int[] eps;

    static {
        System.out.println("dentro do bloco de inicialização estatico (EXECUTA UMA VEZ)");
        eps = new int[5];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;
        }
    }

    static {
        System.out.println("dentro do bloco de incialização 2 (EXECUTA UMA VEZ TAMBEM)");
    }

    {
        System.out.println("bloco de inicialização normal (EXECUTA BASEADO EM QNTD DE OBJETO INICIADOS, NESSE CASO 3X)");
    }

    public Serie() {
        for (int ep : Serie.eps) {
            System.out.println(ep);
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

