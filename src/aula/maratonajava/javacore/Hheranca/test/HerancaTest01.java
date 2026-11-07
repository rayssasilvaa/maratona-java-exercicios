package aula.maratonajava.javacore.Hheranca.test;

import aula.maratonajava.javacore.Hheranca.domain.Endereco;
import aula.maratonajava.javacore.Hheranca.domain.Funcionario;
import aula.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12-1100");
        Pessoa pessoa = new Pessoa("Shadow");
        pessoa.setCpf("12.11.2005");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Leonard");
        funcionario.setCpf("19-0607");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2122);
        funcionario.setIdade(32);

        System.out.println("=====================");

        funcionario.imprime();
    }
}
