package aula.maratonajava.intoducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double annualSalary = 50000;
        double firstTrack = 9.70 / 100;
        double secondTrack = 37.35 / 100;
        double thirdTrack = 49.50 / 100;

        double impost;
        if (annualSalary <= 34712) {
            impost = annualSalary * firstTrack;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            impost = annualSalary * secondTrack;
        } else {
            impost = annualSalary * thirdTrack;
        }
        System.out.println(impost);
    }
}
