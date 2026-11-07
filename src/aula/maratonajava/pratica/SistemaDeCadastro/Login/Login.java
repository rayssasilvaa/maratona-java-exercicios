package aula.maratonajava.pratica.SistemaDeCadastro.Login;

import aula.maratonajava.pratica.SistemaDeCadastro.Cadastro.Cadastro;
import aula.maratonajava.pratica.SistemaDeCadastro.Cadastro.Dados;
import aula.maratonajava.pratica.SistemaDeCadastro.Usuario.UsuarioRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
    public static void login(Scanner input){
        System.out.println("Email: ");
        String emailInput = input.nextLine();

        System.out.println("Senha: ");
        String senhaInput = input.nextLine();

        Dados usuario = UsuarioRepositorio.buscarPorEmail(emailInput);

        if (usuario == null){
            System.out.println("Conta não encontrada!");
            return;
        }

        if (!usuario.getSenha().equalsIgnoreCase(senhaInput)){
            System.out.println("Senha incorreta!");
            return;
        }

        System.out.println("Login realizado com sucesso!");
        System.out.println("Bem-vindo(a) " + usuario.getNome());

    }
}
