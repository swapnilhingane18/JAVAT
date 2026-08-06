import java.util.*;

public class Question15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int sum = 0;

        for (int n = 1; n <= num; n++) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}