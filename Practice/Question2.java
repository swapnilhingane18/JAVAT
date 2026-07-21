import java.util.*;
public class Question2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        System.out.println("Enter c");
        int c = sc.nextInt();

        System.out.println("Enter radius");
        int radius = sc.nextInt();

        double Circleresult = Math.PI * radius*radius ;

        int Rectangle = a * b;


        double Triangle = 0.5 * (a * b);
        System.out.println( "Area of circle" +" " +  Circleresult); 
        System.out.println("Area of Reactangle" + " " + Rectangle);
        System.out.println("Area of Triangle" + " " + Triangle);

  
    }
    }
