package Constructors.Level2;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    // Public method for private salary
    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void display() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: " + getSalary());
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 80000);
        m.display();
        m.setSalary(90000);
        m.display();
    }
}

