package Constructors.Level1;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true; // By default available
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println(title + " by " + author + ", Price: " + price + ", Available: " + available);
    }
}

public class LibraryBookTest {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Java Programming", "James Gosling", 399.99);

        lb.display();
        lb.borrowBook();
        lb.borrowBook();
        lb.display();
    }
}

