class Point {
    private double x;
    private double y;

    // Constructor to initialize the point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to scale the point closer to (0,0) by half
    public void scale() {
        x = x / 2;
        y = y / 2;
    }

    // Method to print the current coordinates of the point
    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Task12 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);  // Starting point
        for (int i = 0; i < 5; i++) {
            p.scale();  // Scale the point
            p.print();  // Print the current location
        }
    }
}
