// even or odd
import java.util.*;

public class Question10{
    public static void main (String args[]){
        
        System.out.println("Enter a number");
        Scanner sc = new Scanner (System.in);

        int n =sc.nextInt();

        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }

        if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

    }
}