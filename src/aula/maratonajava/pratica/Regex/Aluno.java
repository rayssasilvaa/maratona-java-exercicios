package aula.maratonajava.pratica.Regex;

public class Aluno {
    private String nome;
    private String sobremome;
    private String telefone;

    public Aluno(String nome, String sobremome, String telefone) {
        this.nome = nome;
        this.sobremome = sobremome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobremome() {
        return sobremome;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean validar() {
        boolean isNome = nome != null && nome.matches("[a-zA-Z]{2,}");
        boolean isSobrenome = getSobremome() != null && getSobremome().matches("[a-zA-Z]{2,}");
        boolean isTelefone = getTelefone() != null && getTelefone().matches("\\d{10,11}");

        return isNome && isSobrenome && isTelefone;
    }

}
