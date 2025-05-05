public class Task3 {
    public static void main(String[] args) {
        // Using byte for 0
        byte b = 0;
        
        // Using short for 3110 (fits in short range)
        short s = 3110;
        
        // Using int for 2 (used in 2.0)
        int i = 2;

        // Using float for 2.0 (float needs 'f' at the end)
        float f = 2.0f;
        
        // Using char to build letters and digits
        char h = 'H';
        char e1 = '3';
        char e2 = '1';
        char o = 'o';
        char space = ' ';
        char w = 'w';
        char r = 'r';
        char l = 'l';
        char d = 'd';

        // Using boolean
        boolean bool = true;

        // Now building the output step-by-step for clarity
        String output = "" + h + e1 + e2 + e2 + b + space + w + e1 + r + l + d + space + f + space + bool;

        // Print the result
        System.out.println(output);
    }
}
