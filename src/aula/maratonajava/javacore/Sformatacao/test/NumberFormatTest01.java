package aula.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        Locale locale1 = Locale.ENGLISH;
        Locale locale2 = Locale.ITALIAN;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locale);
        nfa[2] = NumberFormat.getInstance(locale1);
        nfa[3] = NumberFormat.getInstance(locale2);

        double valor = 1_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1_000.2130";

        try {

            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
