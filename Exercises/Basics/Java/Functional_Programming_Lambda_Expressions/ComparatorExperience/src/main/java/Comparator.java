public class Comparator implements java.util.Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        // p1 > p2 = 1
        // p1 == p2 = 0
        // p1 < p2 = -1
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
