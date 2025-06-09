import java.util.Scanner;

// Define an abstract class with one abstract method and one concrete method
abstract class MyAbstractClass {
    // Abstract method (no body)
    abstract void abstractMethod();

    // Concrete method (has a body)
    void concreteMethod() {
        System.out.println("This is a concrete method from the abstract class.");
    }
}

// Class B inherits from MyAbstractClass and implements the abstract method
class B extends MyAbstractClass {
    void abstractMethod() {
        System.out.println("Class B's implementation of the abstract method.");
    }
}

// Class C also inherits from MyAbstractClass and provides its own implementation
class C extends MyAbstractClass {
    void abstractMethod() {
        System.out.println("Class C's implementation of the abstract method.");
    }
}

// Main class to run the program
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a class to test (B or C): ");
        String choice = scanner.nextLine();

        MyAbstractClass obj;

        if (choice.equalsIgnoreCase("B")) {
            obj = new B(); // Create an object of class B
        } else if (choice.equalsIgnoreCase("C")) {
            obj = new C(); // Create an object of class C
        } else {
            System.out.println("Invalid choice. Please enter B or C.");
            scanner.close();
            return;
        }

        // Call the abstract and concrete methods
        obj.abstractMethod();    // Calls the class-specific implementation
        obj.concreteMethod();    // Calls the shared method from the abstract class

        scanner.close();
    }
}
