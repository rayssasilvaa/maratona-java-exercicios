package aula.maratonajava.javacore.Npolimorfismo.test;

import aula.maratonajava.javacore.Npolimorfismo.domain.Keyboard;
import aula.maratonajava.javacore.Npolimorfismo.domain.Pc;
import aula.maratonajava.javacore.Npolimorfismo.domain.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Pc("Pczildo", 7000);
        System.out.println(produto.getName());
        System.out.println(produto.getValue());
        System.out.println(produto.calcularImposto());

        System.out.println("==========================");
        Produto produto1 = new Keyboard("Attack Shark X68", 500);
        System.out.println(produto1.getName());
        System.out.println(produto1.getValue());
        System.out.println(produto1.calcularImposto());
    }
}
