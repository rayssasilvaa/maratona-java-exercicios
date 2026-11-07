package aula.maratonajava.javacore.Lclassesabstratas.test;

import aula.maratonajava.javacore.Lclassesabstratas.domain.Dev;
import aula.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import aula.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Homer || ", 5000);
        Dev dev = new Dev("Rayssa || ", 7900);

        System.out.println(gerente);
        System.out.println(dev);
        gerente.imprime();
        dev.imprime();
    }
}
