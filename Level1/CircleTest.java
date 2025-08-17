package Constructors.Level1;

class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        c1.display();
        c2.display();
    }
}
