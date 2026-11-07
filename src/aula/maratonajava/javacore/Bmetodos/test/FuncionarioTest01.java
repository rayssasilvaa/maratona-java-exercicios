package aula.maratonajava.javacore.Bmetodos.test;

import aula.maratonajava.javacore.Bmetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setName("NomeDoFuncionario");
        funcionario.setAge(43);
        funcionario.setSalarys(new double[]{1200, 2143, 1421});


        funcionario.imprime();
    }

}
