package aula.maratonajava.javacore.Aclasses.test;

import aula.maratonajava.javacore.Aclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Rayssa";
        estudante.age = 20;
        estudante.sex = 'F';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }
}
