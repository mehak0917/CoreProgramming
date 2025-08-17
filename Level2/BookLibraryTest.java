package Constructors.Level2;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String i, String t, String a) {
        ISBN = i;
        title = t;
        author = a;
    }

    // Public methods for private variable
    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    EBook(String i, String t, String a) {
        super(i, t, a);
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }
}

public class BookLibraryTest {
    public static void main(String[] args) {
        EBook eb = new EBook("12345", "Java OOP", "James Gosling");
        eb.display();
    }
}

