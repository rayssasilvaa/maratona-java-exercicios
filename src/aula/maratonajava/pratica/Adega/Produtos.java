package aula.maratonajava.pratica.Adega;

import java.util.Objects;

public class Produtos {
    private String bebida;
    private final double valor;
    private final CategoriaBebida categoriaBebida;

    public Produtos(String bebida, double valor, CategoriaBebida categoriaBebida){
        this.bebida = bebida;
        this.valor = valor;
        this.categoriaBebida = categoriaBebida;
    }

    public String getBebida() {
        return bebida;
    }

    public double getValor() {
        return valor;
    }

    public CategoriaBebida getCategoriaBebida() {
        return categoriaBebida;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return Double.compare(valor, produtos.valor) == 0 && Objects.equals(bebida, produtos.bebida) && categoriaBebida == produtos.categoriaBebida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bebida, valor, categoriaBebida);
    }

}
