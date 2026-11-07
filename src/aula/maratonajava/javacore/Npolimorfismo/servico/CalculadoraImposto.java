package aula.maratonajava.javacore.Npolimorfismo.servico;

import aula.maratonajava.javacore.Npolimorfismo.domain.Mouse;
import aula.maratonajava.javacore.Npolimorfismo.domain.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getName());
        System.out.printf("Valor: R$%.3f\n", produto.getValue());
        System.out.printf("Imposto: R$%.3f\n", imposto);

        if (produto instanceof Mouse) {
            Mouse mouse = (Mouse) produto;
            System.out.println("dentro do instanceof");
        }

    }
}
