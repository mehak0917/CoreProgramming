package Constructors.Level2;

class Course {
    String courseName;  // instance
    int duration;       // instance
    double fee;         // instance
    static String instituteName = "ABC Institute"; // class

    Course(String name, int d, double f) {
        courseName = name;
        duration = d;
        fee = f;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class CourseTest {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 5000);
        Course c2 = new Course("Python", 2, 4000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Institute");
        c1.displayCourseDetails();
    }
}

