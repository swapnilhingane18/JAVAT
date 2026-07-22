import java.util.*;
public class Question3{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

      

        int p =sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int n = sc.nextInt();
        
        double result = (p*r*t)/100;
        System.out.println("simple intrest"+" " + result );

        double Compoundresult = p*Math.pow((1+r/(100*n)),n*t);
        System.out.println("Compound Intrest is" + " " + Compoundresult);

    }
}