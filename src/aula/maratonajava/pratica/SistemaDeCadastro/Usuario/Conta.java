
package aula.maratonajava.pratica.SistemaDeCadastro.Usuario;

import aula.maratonajava.pratica.SistemaDeCadastro.Cadastro.Cadastro;
import aula.maratonajava.pratica.SistemaDeCadastro.Login.Login;

import java.util.Scanner;

public class Conta {
    public static void conta(Scanner input) {
        try{
                while (true) {

                    System.out.println("\n--- SISTEMA DE LOGIN/CADASTRO ---\n");

                    System.out.println("1 - Fazer Login");
                    System.out.println("2 - Cadastrar");
                    System.out.println("3 - Sair");

                    System.out.print("\nEscolha uma opção: ");

                    String opcao = input.nextLine().trim();

                    switch (opcao) {
                        case "1":
                            System.out.println("\nInsira seus dados para fazer login:\n");
                            Login.login(input);
                            break;

                        case "2":
                            System.out.println("\nInsira seus dados para se cadastrar:\n");
                            Cadastro.cadastrar(input);
                            break;

                        case "3":
                            System.out.println("Saindo do sistema...");
                            return;

                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                    }
                }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
