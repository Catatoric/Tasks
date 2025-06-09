// Task16.java

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Task16 implements Animal {

    // Feed the gorilla if it's time to eat
    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding the gorilla.");
            return true;
        } else {
            System.out.println("Gorilla is not hungry right now.");
            return false;
        }
    }

    // Groom the gorilla
    @Override
    public void groom() {
        System.out.println("Grooming the gorilla...");
        // lather, rinse, repeat
    }

    // Pet the gorilla with caution
    @Override
    public void pet() {
        System.out.println("Petting the gorilla...");
        // pet at your own risk
    }

    public static void main(String[] args) {
        Task16 gorilla = new Task16();

        // Test feeding the gorilla
        gorilla.feed(true);   // Should feed
        gorilla.feed(false);  // Should not feed

        // Groom the gorilla
        gorilla.groom();

        // Pet the gorilla
        gorilla.pet();
    }
}
