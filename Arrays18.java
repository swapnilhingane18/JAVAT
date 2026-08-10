import java.util.*;

public class Arrays18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                count1 = count1 + arr[i];
            } else {
                count2 = count2 + arr[i];
            }
        }
        System.out.println("sum of even indexes " + count1);
        System.out.println("sum of odd indexes " + count2);
    }
}
