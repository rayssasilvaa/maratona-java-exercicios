package aula.maratonajava.pratica.StreamsPratica;

public class Books {
    private String titleBook;
    private double price;

    public Books(String titleBook, double price){
        this.titleBook = titleBook;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: " + titleBook + " - " + "R$" + price;
    }

    public String getTitleBook(){
        return titleBook;
    }
    public double getPrice(){
        return price;
    }
}
