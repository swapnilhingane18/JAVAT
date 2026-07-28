import java.util.*;

public class Question19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int original = sc.nextInt();
        int n = original;
        Double result = 0.0;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum++;
            n = n / 10;
        }
        n=original;

         while (n != 0) {
            int digit = n % 10;
            result = result + Math.pow( digit,sum);
            n = n / 10; 
        }
 
        if (result == original) {
            System.out.println(result + " is Armstrorm number ");
        } else {
            System.out.println(" is Not a armstrom number ");
        }
    }
}
