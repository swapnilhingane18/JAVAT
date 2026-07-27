import java.util.*;

public class Question19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int original = sc.nextInt();
        int n = original;
        int cube = 0;

        while (n != 0) {
            int digit = n % 10;
            cube = cube + digit * digit * digit;
            n = n / 10;
        }
        if (cube == n) {
            System.out.println(cube + "is Armstrorm number ");
        } else {
            System.out.println("Not a armstrom number ");
        }
    }
}
