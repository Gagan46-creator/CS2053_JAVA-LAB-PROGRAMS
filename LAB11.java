import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - ₹" + price;
    }
}

public class LAB11 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Laptop", 60000));
        list.add(new Product("Phone", 25000));
        list.add(new Product("Headphones", 1500));
        list.add(new Product("Mouse", 800));

        System.out.println("Original List:");
        list.forEach(p -> System.out.println(p));

        list.sort(Comparator.comparingDouble(p -> p.price));
        System.out.println("\nSorted by Price (Ascending):");
        list.forEach(p -> System.out.println(p));

        list.sort(Comparator.comparing(p -> p.name));
        System.out.println("\nSorted by Name (Alphabetical):");
        list.forEach(p -> System.out.println(p));
    }
}
