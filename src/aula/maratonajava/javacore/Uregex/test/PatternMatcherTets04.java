package aula.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTets04 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que nao for digito
        // \ s = espacos em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w a-ZA-Z, digitos, _
        // \W tudo o que nao for incluso no \w
        //[]
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        //{n, m} de n ate m
        // ()
        // |
        // $


        //  String regex = "[coCO]";
        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posicoes encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

//        int numeroHex = 0x7EA;
//        System.out.println(numeroHex);
    }
}
