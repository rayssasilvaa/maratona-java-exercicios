package aula.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String name;
    private Time time;

    public Jogador(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void imprime() {
        System.out.println("Jogador: " + this.name);

        if (time != null) {
            System.out.println("Time: " + time.getName());
        }
    }
}
