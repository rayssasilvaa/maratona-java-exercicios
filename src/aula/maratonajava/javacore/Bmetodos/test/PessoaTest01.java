package aula.maratonajava.javacore.Bmetodos.test;

import aula.maratonajava.javacore.Bmetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setName("Aspas");
        pessoa.setAge(24);

        //  pessoa.imprime();

        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge() + " anos");
    }
}
