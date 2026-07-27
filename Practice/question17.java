//count digits in num

import java.util.*;

public class question17 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int n = sc.nextInt();
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum++;
            n = n / 10;

        }
        System.out.println("No Of Digits " + sum);

    }
}
