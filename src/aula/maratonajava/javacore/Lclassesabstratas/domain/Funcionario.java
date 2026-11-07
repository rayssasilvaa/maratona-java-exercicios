package aula.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa {
    protected String name;
    protected double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calcularBonus();
    }

    public abstract void calcularBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
