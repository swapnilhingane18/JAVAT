import java.util.*;

public class Arrays20 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / n;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            if (average < arr[i]) {
                sum2 = sum2 + arr[i];
            }
        }
        System.out.println("the sum of ele >avg is" + sum2);
    }
}
