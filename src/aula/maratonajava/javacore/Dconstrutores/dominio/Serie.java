package aula.maratonajava.javacore.Dconstrutores.dominio;

public class Serie {
    private String nome;
    private String tipo;
    private String personagens;
    private int episodios;
    private int ano;


    public Serie(String nome, String tipo, String personagens, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.personagens = personagens;
        this.episodios = episodios;
    }

    public Serie(String nome, String tipo, String personagens, int episodios, int ano) {
        this(nome, tipo, personagens, episodios);
        this.ano = ano;
    }

    public void imprime() {
        System.out.println("Nome da serie: " + this.nome);
        System.out.println("Genero da serie: " + this.tipo);
        System.out.println("Quantidade de episodios: " + this.episodios);
        System.out.println("Personagens Principais: " + this.personagens);
        System.out.println("Ano da serie: " + this.ano);
    }
}


