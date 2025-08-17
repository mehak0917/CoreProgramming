package Constructors.Level2;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int r, String n, double c) {
        rollNumber = r;
        name = n;
        CGPA = c;
    }

    // Public methods to access private CGPA
    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int r, String n, double c) {
        super(r, n, c);
    }

    void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }
}

public class StudentTest {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 9.0);
        pg.display();
        pg.setCGPA(9.5);
        pg.display();
    }
}

