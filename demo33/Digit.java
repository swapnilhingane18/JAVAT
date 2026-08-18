import java.util.Scanner;
public class Digit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything ");


        // int n =  sc.nextInt();
        // String res=(n>=0 && n<=9) ? "yes its digit" :"No its not a digit";
        // System.out.println(n + " " +res);

        char ch =sc.next().charAt(0);
        String res=(ch>=48 && ch<=57) ? "yes its digit" :"No its not a digit";
        System.out.println(ch + " " +res);   


    }
}