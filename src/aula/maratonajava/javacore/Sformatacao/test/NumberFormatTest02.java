package aula.maratonajava.javacore.Sformatacao.test;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        Locale locale1 = Locale.JAPAN;
        Locale locale2 = new Locale("it", "ITA");

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(locale);
        nfa[2] = NumberFormat.getCurrencyInstance(locale1);
        nfa[3] = NumberFormat.getCurrencyInstance(locale2);

        double valor = 1000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "$1000.2130";
        try {

            System.out.println("Dentro do Parse: " + nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
