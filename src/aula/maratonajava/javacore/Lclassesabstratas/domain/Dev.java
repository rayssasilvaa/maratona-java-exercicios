package aula.maratonajava.javacore.Lclassesabstratas.domain;

public class Dev extends Funcionario {
    public Dev(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calcularBonus() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
