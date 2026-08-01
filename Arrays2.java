import java.util.*;

public class Arrays2{
    public static void main(String args[]){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}