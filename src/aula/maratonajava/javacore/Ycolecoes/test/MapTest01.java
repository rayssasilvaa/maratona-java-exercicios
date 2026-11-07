package aula.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("vc", "voce");
        map.put("oq", "o que");
        map.put("dnv", "de novo");

        System.out.println(map);

        for (String key : map.keySet()){
            System.out.println("key: " + key );
        }

        System.out.println();

        for (String value : map.values()){
            System.out.println("value: " + value);
        }

        System.out.println();

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
