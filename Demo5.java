import java.util.Scanner;
public class Demo5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your money ");
        int money =sc.nextInt();
        System.out.println("Enter amount deposited ");
        int deposit=sc.nextInt();
        System.out.println("Enter amount withdraw ");
        int withdraw=sc.nextInt();
        
        System.out.println("final balance");
        System.out.println(money+deposit-withdraw);

    }

}