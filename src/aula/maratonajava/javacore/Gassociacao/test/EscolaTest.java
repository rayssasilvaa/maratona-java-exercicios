package aula.maratonajava.javacore.Gassociacao.test;


import aula.maratonajava.javacore.Gassociacao.dominio.Escola;
import aula.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Professor X");
        Professor professor2 = new Professor("A");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Escola X", professores);

        escola.imprime();
    }
}
