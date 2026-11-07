package aula.maratonajava.javacore.CsobrecargaMetodos.dominio;

public class Serie {
    private String nome;
    private String tipo;
    private String personagens;
    private int episodios;


    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String personagens) {
        this.init(nome, tipo, episodios);
        this.personagens = personagens;
    }

    public void imprime() {
        System.out.println("Nome da serie: " + this.nome);
        System.out.println("Genero da serie: " + this.tipo);
        System.out.println("Quantidade de episodios: " + this.episodios);
        System.out.println("Personagens Principais: " + this.personagens);
    }


//    public void setTipo(String tipo){
//        this.tipo = tipo;
//    }
//
//    public String getTipo(){
//        return this.tipo;
//    }
//
//    public void setEpisodios(int qntdDeEpisodios){
//        this.episodios = qntdDeEpisodios;
//    }
//
//    public int getEpisodios(){
//        return this.episodios;
//    }
}
