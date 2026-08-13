import java.util.*;

public class Arrays22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Element you want to access");
        int m = sc.nextInt();
        System.out.println("Enter the element you want to insert");
        arr[m] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
    }
}