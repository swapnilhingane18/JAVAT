import java.util.*;

public class Arrays20 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

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
        System.out.println(sum2);
    }
}
