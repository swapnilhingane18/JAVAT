import java.util.Scanner;

public class Largestat2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1=sc.nextInt();

        System.out.println("Enter second number");
        int num2=sc.nextInt();

        String res=(num1>num2)?"First number is Largest ":"Second number is Largest";
        System.out.println(res);
        
    }

}