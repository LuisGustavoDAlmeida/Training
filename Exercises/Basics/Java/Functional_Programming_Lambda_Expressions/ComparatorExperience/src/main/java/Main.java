import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.0));
        products.add(new Product("Notebook", 1200.0));
        products.add(new Product("Tablet", 450.0));


                /*new Comparator<Product>() { // Implementação com classe anônima
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };*/

        // Função anônima com arrow function, o tipo é inferido pelo compilador e não há necessidade de return
        products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); // Precisa de um comparator como argumento, ele é uma interface

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
