import java.util.Scanner;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Abstract class implementing Shape
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

// Circle class extending AbstractShape
class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); // length and width are not used in Circle
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class extending AbstractShape
class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Circle
        System.out.print("Enter color of the circle: ");
        String circleColor = scanner.nextLine();
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Circle circle = new Circle(circleColor, radius);

        System.out.println("\nCircle Details:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println();

        // Input for Rectangle
        System.out.print("Enter color of the rectangle: ");
        String rectColor = scanner.nextLine();
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(rectColor, length, width);

        System.out.println("\nRectangle Details:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        scanner.close();
    }
}
