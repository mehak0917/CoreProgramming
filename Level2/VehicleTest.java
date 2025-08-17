package Constructors.Level2;

class Vehicle {
    String ownerName;   // instance
    String vehicleType; // instance
    static double registrationFee = 1000; // class

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);
        v1.displayVehicleDetails();
    }
}

