package aula.maratonajava.javacore.Bmetodos.test;

import aula.maratonajava.javacore.Bmetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "Rayssa";
        estudante01.age = 20;
        estudante01.sex = 'F';

        estudante02.name = "Ingrid";
        estudante02.age = 18;
        estudante02.sex = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
