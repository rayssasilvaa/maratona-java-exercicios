package aula.maratonajava.javacore.FmodificadorEstatico.domain;

public class Carro {
    private String nome;
    private double velMax;
    private static double velLimite = 250;

    public Carro(String nome, double velMax) {
        this.nome = nome;
        this.velMax = velMax;
    }

    public void imprime() {
        System.out.println("===========================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velMax);
        System.out.println("Velocidade Limite: " + Carro.velLimite);
    }

    public static void setVelLimite(double velLimite) {
        Carro.velLimite = velLimite;
    }

    public static double getVelLimite() {
        return Carro.velLimite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public String getNome() {
        return nome;
    }

    public double getVelMax() {
        return velMax;
    }


}
