package aula.maratonajava.javacore.Bmetodos.test;

import aula.maratonajava.javacore.Bmetodos.dominio.Estudante;
import aula.maratonajava.javacore.Bmetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Rayssa";
        estudante01.age = 20;
        estudante01.sex = 'F';

        estudante02.name = "Fernando";
        estudante02.age = 20;
        estudante02.sex = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
