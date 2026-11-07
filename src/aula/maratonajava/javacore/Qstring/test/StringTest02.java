package aula.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Rayssa";
        String numeros = "12345";
        String nomeComEspacos = "      rayssa        ";

        System.out.println(nome.charAt(4));
        System.out.println(nome.length());
        System.out.println(nome.replace("y", "i"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.substring(0, 4));

        System.out.println(nomeComEspacos);
        System.out.println(nomeComEspacos.trim());
    }
}
