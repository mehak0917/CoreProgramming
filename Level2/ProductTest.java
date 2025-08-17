package Constructors.Level2;

class Product {
    String productName;   // instance variable
    double price;         // instance variable
    static int totalProducts = 0; // class variable

    // Constructor
    Product(String name, double p) {
        productName = name;
        price = p;
        totalProducts++;
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
