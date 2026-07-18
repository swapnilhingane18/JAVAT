// Loops in Java - for, while, do-while
public class Loops {
    public static void main(String args[]) {

        // For loop
        System.out.println("=== For Loop (1 to 5) ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // While loop
        System.out.println("\n=== While Loop (5 to 1) ===");
        int num = 5;
        while (num >= 1) {
            System.out.println("Countdown: " + num);
            num--;
        }

        // Do-While loop
        System.out.println("\n=== Do-While Loop ===");
        int x = 1;
        do {
            System.out.println("x = " + x);
            x *= 2;
        } while (x <= 16);

        // For-each loop with array
        System.out.println("\n=== For-Each Loop ===");
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
