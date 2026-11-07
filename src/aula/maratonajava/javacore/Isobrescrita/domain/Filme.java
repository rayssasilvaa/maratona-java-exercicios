package aula.maratonajava.javacore.Isobrescrita.domain;

public class Filme {
    private String nome;

    @Override
    public String toString() {
        return "Filme: " + this.nome;
    }

    public Filme(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
