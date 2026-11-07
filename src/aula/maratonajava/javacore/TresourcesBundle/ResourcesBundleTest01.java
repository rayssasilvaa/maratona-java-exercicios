package aula.maratonajava.javacore.TresourcesBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundleTest01 {
    public static void main(String[] args) {
        Locale brasil = new Locale("pt", "BR");
        Locale eua = Locale.getDefault();

        ResourceBundle bundle = ResourceBundle.getBundle("messages", eua);
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.night"));

        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", brasil);
        System.out.println(bundle1.getString("hello"));
        System.out.println(bundle1.getString("good.night"));
    }
}
