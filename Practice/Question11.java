// Largest of 2 numbers
import java.util.*;

public class Question11{
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1 st number");
        int n = sc.nextInt();
        System.out.println("Enter 1 st number");
        int m = sc.nextInt();

        if(m>n){
            System.out.println("m is greater");
        }
        else{
            System.out.println("n is greater");
        }

    }
}