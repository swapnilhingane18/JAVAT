//average of 3 nums 
import java.util.*;

public class Question8{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no ");
        int c = sc.nextInt();

        int average = (a+b+c)/3;

        System.out.println("The average is " + average);


    }
}