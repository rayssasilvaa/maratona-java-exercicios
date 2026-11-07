package aula.maratonajava.pratica.EstudoLambda;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class EstudoLambda {
    static class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
    }

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>(List.of(
                new Produto("Cheese Burguer", 18.00),
                new Produto("Bacon Burguer", 30.00),
                new Produto("Chicken Burguer", 25.00),
                new Produto("Onion Rings Burguer", 35.00)
        ));

        // 1. Runnable - não recebe nem devolve nada
        Runnable r = () -> System.out.println("=== Menu ===");
        r.run();

        // 2. Consumer - recebe algo, não devolve nada (aqui usado no forEach)
        Consumer<Produto> printMenu = p -> System.out.println(p.getNome() + " - $" + p.getPreco());
        System.out.println("\nMenu list");
        produtos.forEach(printMenu);

        // 3. Predicate - condição (true/false), usado no filter
        Predicate<Produto> promo = p -> p.getPreco() < 20;
        System.out.println("\nPromoção: ");
        produtos.stream()
                .filter(promo)
                .forEach(p -> System.out.println(p.getNome()));

        // 4. Function - transforma um tipo em outro, usado no map
        Function<Produto, String> paraTexto = p -> p.getNome().toUpperCase() + " ($" + p.getPreco() + ")";
        System.out.println("\nProdutos em texto formatado:");
        List<String> textos = produtos.stream()
                .map(paraTexto)
                .collect(Collectors.toList());
        textos.forEach(System.out::println); // method reference

        // 5. Supplier - fornece um valor, sem receber nada
        Supplier<Produto> criarBrinde = () -> new Produto("Batata Frita", 0.0);
        Produto brinde = criarBrinde.get();
        System.out.println("\nBrinde: " + brinde.getNome());

        // 6. Comparator - comparar/ordenar
        produtos.sort((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));
        System.out.println("\nProdutos ordenados por preço:");
        produtos.forEach(p -> System.out.println(p.getNome() + " - R$" + p.getPreco()));

        // 7. BiFunction - recebe dois parâmetros, devolve um resultado
        BiFunction<Double, Double, Double> somarPrecos = (a, b) -> a + b;
        double total = somarPrecos.apply(100.0, 250.0);
        System.out.println("\nSoma de exemplo: R$" + total);
    }
}