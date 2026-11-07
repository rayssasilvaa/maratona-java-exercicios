package aula.maratonajava.javacore.Gassociacao.test;

import aula.maratonajava.javacore.Gassociacao.dominio.Aluno;
import aula.maratonajava.javacore.Gassociacao.dominio.Local;
import aula.maratonajava.javacore.Gassociacao.dominio.Professor;
import aula.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua dos Limoeiros");
        Aluno aluno1 = new Aluno("Cebolinha", 21);
        Aluno aluno2 = new Aluno("Mônica", 23);
        Aluno aluno3 = new Aluno("Cascão", 19);
        Professor professor = new Professor("Professor Licurgo", "Historia");
        Aluno[] alunosSeminario = {aluno1, aluno2, aluno3};

        Seminario seminarios = new Seminario("A turma da Mônica", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminarios};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
