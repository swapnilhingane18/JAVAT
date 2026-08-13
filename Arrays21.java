import java.util.*;

public class Arrays21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in array");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Element you want to access");

        int m = sc.nextInt();
        if (m < arr.length && m >= 0) {
            System.out.println(arr[m]);
        } else {
            System.out.println("Index is out of range");
        }
    }
}