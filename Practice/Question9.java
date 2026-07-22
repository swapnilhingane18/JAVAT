import java.util.*;

public class Question9{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter number");
        double num=sc.nextDouble();

        double square = Math.pow(num,2);
        double cube = Math.pow(num,3);

        System.out.println(square);
        System.out.println(cube);


    }
}