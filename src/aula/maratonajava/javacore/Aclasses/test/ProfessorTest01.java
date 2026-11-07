package aula.maratonajava.javacore.Aclasses.test;

import aula.maratonajava.javacore.Aclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "professorX";
        professor.age = 34;
        professor.sex = 'M';

        System.out.println(professor.name + " " + professor.age + " " + professor.sex);
    }
}
