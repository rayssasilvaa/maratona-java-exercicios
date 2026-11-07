package aula.maratonajava.javacore.Npolimorfismo.domain;

public class Mouse extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.20;

    public Mouse(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto...");
        return this.value * IMPOSTO_POR_CENTO;
    }
}
