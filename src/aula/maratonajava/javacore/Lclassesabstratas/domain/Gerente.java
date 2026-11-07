package aula.maratonajava.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calcularBonus() {
        this.salary += salary * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name +
                "salary=" + salary +
                '\'' +
                '}';
    }

}
