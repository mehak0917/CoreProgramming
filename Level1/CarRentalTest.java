package Constructors.Level1;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay = 1000; // Example price

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double totalCost() {
        return rentalDays * pricePerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + totalCost());
    }
}

public class CarRentalTest {
    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Alice", "Sedan", 5);

        r1.display();
        r2.display();
    }
}
