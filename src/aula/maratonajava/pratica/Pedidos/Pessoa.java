package aula.maratonajava.pratica.Pedidos;

public class Pessoa {
    public String nome;
    public String wpp;

    public Pessoa(String nome, String wpp) {
        this.nome = nome;
        this.wpp = wpp;
    }

    public void setPessoa(String nome) {
        this.nome = nome;
    }

    public void setWpp(String wpp) {
        this.wpp = wpp;
    }

    public String getNome() {
        return nome;
    }

    public String getWpp() {
        return wpp;
    }
}
