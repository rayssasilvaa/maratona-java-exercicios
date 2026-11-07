package aula.maratonajava.pratica.Adega;

public class AdegaTest {
    public static void main(String[] args) {

        Adega<Produtos> venda = new Adega<>();

        venda.add(new Produtos("Coca", 2.11, CategoriaBebida.BEBIDA_SEM_ALCOOL));

        venda.executar();

    }
}
