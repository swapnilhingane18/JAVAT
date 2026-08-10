import java.util.*;

public class Arrays19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int smallest2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            } else {
                if (arr[i] < smallest2) {
                    smallest2 = arr[i];
                }
            }
        }
        System.out.println(largest);
        System.out.println(smallest2);
    }
}
