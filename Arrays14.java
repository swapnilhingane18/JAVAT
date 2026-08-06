import java.util.*;

public class Arrays14 {
    public static void main(String args[]) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest2 = smallest;
                smallest = arr[i];
            } else if (arr[i] < smallest2 && arr[i] > smallest) {
                smallest2 = arr[i];
            }
        }
        System.out.println("the smallest no is " + smallest);
        System.out.println("The Second number is " + smallest2);
    }
}