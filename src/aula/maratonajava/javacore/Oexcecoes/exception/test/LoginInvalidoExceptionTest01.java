package aula.maratonajava.javacore.Oexcecoes.exception.test;

import aula.maratonajava.javacore.Oexcecoes.exception.domain.LoginInvalido;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalido e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalido {
        Scanner input = new Scanner(System.in);

        String usernameDB = "yssa";
        String senhaDB = "121105";


        System.out.println("Usuario: ");
        String userDigit = input.nextLine();

        System.out.println("Senha: ");
        String senhaDigit = input.nextLine();

        if (!userDigit.equals(usernameDB) || !senhaDigit.equals(senhaDB)) {
            throw new LoginInvalido("Usuario ou senha invalido!");
        }

        System.out.println("Login com sucesso!");
    }
}
