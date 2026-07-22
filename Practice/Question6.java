// Calculator
import java.util.*;

public class Question6{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("eneter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        System.out.println("Addition is " + (a+b));
        System.out.println("Subtraction is " + (a-b));
        System.out.println("Multiplication is " + (a*b));
        System.out.println("Division is " + (a/b));
        System.out.println("reminder is " + (a%b));


    }

}