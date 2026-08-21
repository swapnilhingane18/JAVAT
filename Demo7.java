import java.util.Scanner;
public class Demo7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your principle amt");
        int principle =sc.nextInt();

        System.out.println("Enter intrest ");
        int intrest=sc.nextInt();

        System.out.println("years ");
        int years=sc.nextInt();

        int amount=(principle*intrest*years)/100;
        System.out.println("amountis "+ amount);
        }}