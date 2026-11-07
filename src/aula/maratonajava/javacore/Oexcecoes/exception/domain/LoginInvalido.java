package aula.maratonajava.javacore.Oexcecoes.exception.domain;

public class LoginInvalido extends Exception {
    public LoginInvalido() {
        super("Login invalido!");
    }

    public LoginInvalido(String message) {
        super(message);
    }
}
