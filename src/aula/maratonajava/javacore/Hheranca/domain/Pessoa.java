package aula.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("1 - Dentro do bloco de inicializacao estatico de Pessoa");
    }

    {
        System.out.println("2 - Dentro do bloco de inicializacao padrao de pessoa(nao estatico)");
    }

    {
        System.out.println("3 - Dentro do segundo bloco de inicializacao padrao de pessoa");
    }

    public Pessoa(String nome) {
        System.out.println("4 - Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + endereco.getCep());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
