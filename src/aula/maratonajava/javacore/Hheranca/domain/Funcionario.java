package aula.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;
    private int idade;

    static {
        System.out.println("1 - Dentro do bloco de inicializacao estatico de Funcionario");
    }

    {
        System.out.println("2 - Dentro do bloco de inicializacao padrao de funcionario(nao estatico)");
    }

    {
        System.out.println("3 - Dentro do segundo bloco de inicializacao padrao de funcionario");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("4 - Dentro do construtor de Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
        System.out.println("Idade: " + this.idade);
        System.out.println("O funcionario " + this.nome + " recebe um salario de R$" + this.salario);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

}
