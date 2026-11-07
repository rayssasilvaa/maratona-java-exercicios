package aula.maratonajava.javacore.Npolimorfismo.test;

import aula.maratonajava.javacore.Npolimorfismo.domain.Keyboard;
import aula.maratonajava.javacore.Npolimorfismo.domain.Mouse;
import aula.maratonajava.javacore.Npolimorfismo.domain.Pc;
import aula.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Pc pc = new Pc("Pcnildo", 5.499);
        Keyboard keyboard = new Keyboard("Razer Huntsman V3 pro mini", 1000);
        Mouse mouse = new Mouse("Attack Shark x11", 300);
        CalculadoraImposto.calcularImposto(pc);
        ;
        System.out.println("==================================");
        CalculadoraImposto.calcularImposto(keyboard);
        System.out.println("==================================");
        CalculadoraImposto.calcularImposto(mouse);
    }
}
