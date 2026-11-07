
package aula.maratonajava.pratica.SistemaDeCadastro.Cadastro;

import aula.maratonajava.pratica.SistemaDeCadastro.Usuario.UsuarioRepositorio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Cadastro {

    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd/MM/uuuu")
                    .withResolverStyle(ResolverStyle.STRICT);

    public static void cadastrar(Scanner input) {

        System.out.println("=== Cadastro ===\n");

        System.out.print("Nome: ");
        String nome = input.nextLine().trim();

        System.out.print("Sobrenome: ");
        String sobrenome = input.nextLine().trim();

        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String data = input.nextLine().trim();

        System.out.print("E-mail: ");
        String email = input.nextLine().trim();

        System.out.print("Senha: ");
        String senha = input.nextLine();

        if (!validarNome(nome)) {
            System.out.println("Nome inválido!");
            return;
        }

        if (!validarSobrenome(sobrenome)) {
            System.out.println("Sobrenome inválido!");
            return;
        }

        if (!validarData(data)) {
            System.out.println("Data de nascimento inválida!");
            return;
        }

        if (!validarEmail(email)) {
            System.out.println("E-mail inválido!");
            return;
        }

        if (!validarSenha(senha)) {
            System.out.println("Senha inválida!");
            return;
        }

        if (UsuarioRepositorio.buscarPorEmail(email) != null) {
            System.out.println("Este e-mail já está cadastrado!");
            return;
        }

        LocalDate dataNascimento = LocalDate.parse(data, formatter);

        Dados novoUsuario = new Dados();

        novoUsuario.setNome(nome);
        novoUsuario.setSobrenome(sobrenome);
        novoUsuario.setDataNasc(dataNascimento);
        novoUsuario.setEmail(email);
        novoUsuario.setSenha(senha);

        UsuarioRepositorio.adicionar(novoUsuario);

        System.out.println("\nCadastro realizado com sucesso!");
    }

    private static boolean validarNome(String nome) {
        return nome.matches("[\\p{L}]{2,}");
    }

    private static boolean validarSobrenome(String sobrenome) {
        return sobrenome.matches("[\\p{L}]+(?: [\\p{L}]+)*");
    }

    private static boolean validarData(String data) {
        try {
            LocalDate.parse(data, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private static boolean validarEmail(String email) {
        String regex =
                "^[\\w.+-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+$";

        return email.matches(regex);
    }

    private static boolean validarSenha(String senha) {
        String regex = "^(?=.*[!@#])[a-zA-Z\\d!@#]{6,}$";

        return senha.matches(regex);
    }
}
