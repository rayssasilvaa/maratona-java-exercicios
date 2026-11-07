package aula.maratonajava.javacore.ZZEstreams.domain;

public class Hq {
    private String title;
    private double price;

    public Hq(String title, double price){
        this.title = title;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Hq{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }


}
