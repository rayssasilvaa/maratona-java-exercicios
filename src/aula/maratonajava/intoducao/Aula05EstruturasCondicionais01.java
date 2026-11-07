package aula.maratonajava.intoducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int ageAlcool = 12;
        boolean isAutorizado = ageAlcool >= 18;
        if (isAutorizado) {
            System.out.println("permitido bebida alcoolica");
        } else {
            System.out.println("Proibido venda");


            int age = 16;
            if (age < 15) {
                System.out.println("Categoria infatil");
            } else if (age >= 15 && age < 18) {
                System.out.println("Categoria juvenil");
            } else {
                System.out.println("Categoria adulto");
            }
        }
    }
}
