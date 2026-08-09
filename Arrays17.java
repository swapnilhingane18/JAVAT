import java.util.*;

public class Arrays17 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 1) {
                count1++;
            } else if (arr[i] == 0) {
                count2++;
            } else {
                count3++;
            }
        }
        System.out.println("Positive nums are " + count1);
        System.out.println("Zero nums are " + count2);
        System.out.println("Negative nums are " + count3);
    }
}
