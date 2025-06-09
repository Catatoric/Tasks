// Base class called Vehicle
class Vehicle {
    String make;
    String model;
    int year;

    // Constructor to set values
    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

// Derived class called Car that extends Vehicle
class Car extends Vehicle {
    int numberOfDoors;

    // Constructor for Car that also calls the Vehicle constructor
    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Calls the constructor of Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display the car details
    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Main class must match the file name
public class Task13 {
    public static void main(String[] args) {
        // Creating an object of Car and setting values
        Car myCar = new Car("Toyota", "Camry", 2022, 4);

        // Displaying the details
        myCar.displayDetails();
    }
}