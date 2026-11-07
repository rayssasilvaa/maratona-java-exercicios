package aula.maratonajava.javacore.Npolimorfismo.domain;

public class Keyboard extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.20;

    public Keyboard(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto...");
        return this.value * IMPOSTO_POR_CENTO;
    }
}
