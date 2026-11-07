package aula.maratonajava.pratica.Pedidos;

public class Pedido extends Pessoa {
    private String item;
    private Menu tipo;

    public Pedido(String nome, String wpp) {
        super(nome, wpp);
    }

    public void resumoDoPedido() {
        System.out.println("========================");
        System.out.println("Nome: " + nome);
        System.out.println("Whatsapp: " + wpp);
        System.out.println("Tipo: " + tipo);
        System.out.println("Pedido: " + item);
        System.out.println("========================");
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setTipo(Menu tipo) {
        this.tipo = tipo;
    }


}
