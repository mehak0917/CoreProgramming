package Constructors.Level1;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1); // Copying

        p1.display();
        p2.display();
    }
}
