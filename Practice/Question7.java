//percentage of 5 subject 
import java.util.*;

public class Question7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Total Marks");
        double req =sc.nextDouble();

        System.out.println("Enter sub1 marks");
        double sub1=sc.nextDouble();
        System.out.println("Enter sub2 marks");
        double sub2=sc.nextDouble();
        System.out.println("Enter sub3 marks");
        double sub3=sc.nextDouble();
        System.out.println("Enter sub4 marks");
        double sub4=sc.nextDouble();
        System.out.println("Enter sub5 marks");
        double sub5=sc.nextDouble();

        System.out.println("sub1 " + (sub1/req)*100  + "%");
        System.out.println("sub2 " + (sub2/req)*100 + "%");
        System.out.println("sub3 " + (sub3/req)*100 + "%");
        System.out.println("sub4 " + (sub4/req)*100 + "%");
        System.out.println("sub5 " + (sub5/req)*100 + "%");
    
    }
}