package aula.maratonajava.intoducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        int day = 1;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}
