package aula.maratonajava.javacore.Xserializacao.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private transient String password;
    private transient Turma turma;

    public Aluno(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Turma getTurma() {
        return turma;
    }

    public String getPassword() {
        return password;
    }


}
