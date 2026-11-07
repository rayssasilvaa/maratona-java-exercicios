package aula.maratonajava.pratica.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExRegex01 {
    public static void main(String[] args) {
        verificacao();
    }

    public static void verificacao() {
        String emailRegex = "([a-zA-Z_-])@+([a-z])+(\\.([a-z]))";
        String senhaRegex = "^(?=.*[!@#])[a-zA-Z\\d!@#]{6,}$";

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um email: ");
        String email = input.next();

        System.out.println("Insira uma senha: ");
        String senha = input.next();

        boolean emailValido = email.matches(emailRegex);
        boolean senhaValida = senha.matches(senhaRegex);

        if (!emailValido) {
            System.out.println("Email invalido!");
        } else if (!senhaValida) {
            System.out.println("senha invalida!");
        } else {
            System.out.println("Login realizado com sucesso!");
        }

        input.close();
    }
}
