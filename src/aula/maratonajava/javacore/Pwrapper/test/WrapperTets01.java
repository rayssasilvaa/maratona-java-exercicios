package aula.maratonajava.javacore.Pwrapper.test;

public class WrapperTets01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'R';
        boolean booleanP = true;

        //Wrapper
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'R';
        Boolean booleanW = true;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean isTrue = Boolean.parseBoolean("True");

        System.out.println(Character.isDigit('R'));
        System.out.println(Character.isLetterOrDigit('6'));
        System.out.println(Character.isUpperCase('R'));
        System.out.println(Character.isLowerCase('r'));
        System.out.println(Character.toLowerCase('R'));
        System.out.println(Character.toUpperCase('r'));
    }
}
