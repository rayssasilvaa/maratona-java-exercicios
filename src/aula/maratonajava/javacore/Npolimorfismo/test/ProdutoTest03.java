package aula.maratonajava.javacore.Npolimorfismo.test;

import aula.maratonajava.javacore.Npolimorfismo.domain.Keyboard;
import aula.maratonajava.javacore.Npolimorfismo.domain.Mouse;
import aula.maratonajava.javacore.Npolimorfismo.domain.Pc;
import aula.maratonajava.javacore.Npolimorfismo.domain.Produto;
import aula.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Pc("Pczildo", 7000);
        Produto produto1 = new Keyboard("Attack Shark X68", 500);

        Mouse mouse = new Mouse("Attack Shark x11", 300);

        CalculadoraImposto.calcularImposto(mouse);
    }
}
