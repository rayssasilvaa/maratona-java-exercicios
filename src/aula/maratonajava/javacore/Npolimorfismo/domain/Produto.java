package aula.maratonajava.javacore.Npolimorfismo.domain;

public abstract class Produto implements Taxavel {
    protected String name;
    protected double value;

    public Produto(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
