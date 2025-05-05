public class Task3 {
    public static void main(String[] args) {
        // Making a and b refer to the same string object
        String a = "Wow";
        String b = "Wow";
        
        // c must not equal a, so we use a different string
        String c = "NotWow";

        // d should equal b + "!" => "Wow!"
        String d = "Wow!";

        // Now test the conditions
        boolean b1 = a == b;                // true (same string literal, same object)
        boolean b2 = d.equals(b + "!");     // true ("Wow!" equals "Wow" + "!")
        boolean b3 = !c.equals(a);          // true ("NotWow" != "Wow")

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        } else {
            System.out.println("Failed!");
        }
    }
}
