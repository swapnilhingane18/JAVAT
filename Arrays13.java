import java.util.*;

public class Arrays13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int largest2 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest2 = largest;
                largest = arr[i];
            } else if (largest2 < arr[i] && arr[i] < largest) {
                largest2 = arr[i];

            }
        }
        System.out.println("Largestis " + largest);
        System.out.println("2nd Largestis " + largest2);

    }
}
