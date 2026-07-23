import java.util.*;

public class Question14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int n = sc.nextInt();

        if(n % 400 == 0){
            System.out.println("Leap year");
        }else if(n % 4==0 && n % 100 !=0){
            System.out.println("leap year");
        }else{
            System.out.println("Not a leap year ");
        }
    }
}