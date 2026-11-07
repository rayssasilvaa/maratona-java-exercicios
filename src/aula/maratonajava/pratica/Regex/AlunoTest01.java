package aula.maratonajava.pratica.Regex;

import java.util.Scanner;

public class AlunoTest01 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Escreva seu nome: ");
            String nomeInput = input.nextLine();

            System.out.println("Escreva seu sobrenome: ");
            String sobrenomeInput = input.nextLine();

            System.out.println("Escreva seu telefone: ");
            String telefoneInput = input.nextLine();

            Aluno aluno = new Aluno(nomeInput, sobrenomeInput, telefoneInput);

            if (aluno.validar()) {
                System.out.println("Cadastrado com sucesso!");
            } else {
                throw new RuntimeException("ERRO: DADOS INVALIDOS!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sistema encerrado!");
        }
    }

    static {
        System.out.println("Sistema de verificação de dados");
    }
}
