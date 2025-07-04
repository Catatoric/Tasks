import java.util.*;

public class CashPH {

    static Scanner scanner = new Scanner(System.in);

    static final String DEFAULT_USERNAME = "admin1";
    static final String DEFAULT_PASSWORD = "admin1";

    static Map<String, Double> users = new HashMap<>();
    static List<String> transactions = new ArrayList<>();

    public static void main(String[] args) {
        // Initialize users
        users.put("admin1", 0.0);
        users.put("user2", 0.0); // receiver in transfers

        System.out.println("*******************");
        System.out.println("Welcome to CashPH!");
        System.out.println("Please log in first.");
        System.out.println("*******************");

        // Prompt for login
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (!authenticate(inputUsername, inputPassword)) {
            System.out.println("Invalid credentials. Exiting program...");
            return;
        }

        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("\n***************");
            System.out.println("CASH PH MENU");
            System.out.println("***************");
            System.out.println("1. Check Balance");
            System.out.println("2. Cash In");
            System.out.println("3. Cash Transfer");
            System.out.println("4. Check Transactions");
            System.out.println("5. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(inputUsername);
                    break;
                case 2:
                    cashIn(inputUsername);
                    break;
                case 3:
                    cashTransfer(inputUsername);
                    break;
                case 4:
                    checkTransactions();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }

        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");

        scanner.close();
    }

    static boolean authenticate(String username, String password) {
        return DEFAULT_USERNAME.equals(username) && DEFAULT_PASSWORD.equals(password);
    }

    static void checkBalance(String username) {
        System.out.println("***************");
        System.out.printf("Current Balance: ₱%.2f\n", users.get(username));
    }

    static void cashIn(String username) {
        System.out.print("Enter amount to cash in: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than 0.");
            return;
        }

        double newBalance = users.get(username) + amount;
        users.put(username, newBalance);
        transactions.add(username + " cashed in ₱" + amount);
        System.out.println("Cash in successful.");
    }

    static void cashTransfer(String senderUsername) {
        System.out.print("Enter recipient username (only 'user2' is supported): ");
        String receiver = scanner.next();

        if (!users.containsKey(receiver)) {
            System.out.println("User does not exist.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than 0.");
            return;
        }

        double senderBalance = users.get(senderUsername);

        if (senderBalance < amount) {
            System.out.println("Insufficient balance.");
            return;
        }

        // Perform transfer
        users.put(senderUsername, senderBalance - amount);
        users.put(receiver, users.get(receiver) + amount);

        transactions.add(senderUsername + " transferred ₱" + amount + " to " + receiver);
        System.out.println("Cash transfer successful.");
    }

    static void checkTransactions() {
        System.out.println("\n***************");
        System.out.println("TRANSACTION HISTORY");
        System.out.println("***************");

        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String log : transactions) {
                System.out.println("- " + log);
            }
        }
    }
}
