package aula.maratonajava.pratica.InnerClass;

import java.util.List;

public class Store{
    private final List<String> productName = List.of("Keyboard", "Mouse");

    class Products {
        private final List<String> productBrand = List.of("Razer", "Apple");

        public void productPrint(){
            for (String n : productName){
                System.out.println("Product: " + n);

                for (String b : productBrand){
                    System.out.println("Brand: " + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        Store store = new Store();

        Products products = store.new Products();
        products.productPrint();
    }
}
