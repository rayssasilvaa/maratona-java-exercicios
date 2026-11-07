package aula.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeBrasil = new Locale("pt", "BR");
        Locale localeEua = new Locale("us", "EUA");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeEua);

        System.out.println("Italia: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("Brasil: " + df3.format(calendar.getTime()));
        System.out.println("EUA: " + df4.format(calendar.getTime()));
    }
}
