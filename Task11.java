public class Task11 {

    // Book class inside the same file
    static class Book {
        // Attributes
        String title;
        String author;
        int yearPublished;
        double price;

        // Constructor
        public Book(String title, String author, int yearPublished, double price) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
            this.price = price;
        }

        // Method to return book details
        public String toString() {
            return "Title: \"" + title + "\"\n" +
                   "Author: \"" + author + "\"\n" +
                   "Year Published: " + yearPublished + "\n" +
                   "Price: $" + price;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Printing book details
        System.out.println("Book 1:\n" + book1 + "\n");
        System.out.println("Book 2:\n" + book2 + "\n");
        System.out.println("Book 3:\n" + book3);
    }
}
