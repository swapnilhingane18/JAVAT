//the average is
import java.util.*;
public class Arrays7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float sum=0;
        float avg=0;
        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        System.out.println("The average is " + avg);
    }
}