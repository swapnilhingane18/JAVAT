import java.util.*;

public class Arrays3{
    public static void main(String args[]){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int largest = arr[0];
        int smallest =arr[0];
        for(int i=0;i<arr.length;i++){

            if(largest<arr[i]){
                largest=arr[i];
            } 
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("The smallest is "+ smallest);
        System.out.println("The largest is "+ largest);
    }
}