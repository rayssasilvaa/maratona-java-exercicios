package aula.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Series implements Comparable<Series> {
    private Long id;
    private String nome;
    private int ep;
    private int ano;

    public Series(Long id, String nome, int ep) {
        Objects.requireNonNull(id, "Nao pode ser NULL");
        Objects.requireNonNull(nome, "Nao pode ser NULL");
        this.id = id;
        this.nome = nome;
        this.ep = ep;
    }

    public Series(Long id, String nome, int ep, int ano){
        this(id, nome, ep);
            this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(id, series.id) && Objects.equals(nome, series.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Series{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ep=" + ep +
                ", ano=" + ano +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getEp() {
        return ep;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public int compareTo(Series outraSerie) {
        //negativo se o this < outraSerie
        //se this == outraSerie, return 0
        //positivo se o this > outraSerie

//        if(this.id < outraSerie.getId()){
//            return -1;
//        }
//        if (this.id.equals(outraSerie.getId())){
//            return 0;
//        } else {
//            return 1;
//        }

        return Integer.valueOf(ep).compareTo(outraSerie.getEp());

    }
}
