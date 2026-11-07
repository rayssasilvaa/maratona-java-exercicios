package aula.maratonajava.javacore.Bmetodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salarys;
    private double media;

    public void imprime() {
        System.out.println("Informações do funcionario: \n");
        System.out.println("nome: " + this.name);
        System.out.println("idade: " + this.age);

        for (double salary : salarys) {
            System.out.print(salary + " ");
        }
        imprimeAverageSalary();
    }

    public void imprimeAverageSalary() {
        for (double salary : salarys) {
            media += salary;
        }

        media /= salarys.length;
        System.out.println("\nMédia salarial: " + media);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalarys(double[] salarys) {
        this.salarys = salarys;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double[] getSalarys() {
        return this.salarys;
    }

    public double getMedia() {
        return this.media;
    }
}



