import java.util.Scanner;

public class Demo12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("add amount principle");
        int amount =sc.nextInt();

        System.out.println("intrest");
        int intrest=sc.nextInt();

        int time=sc.nextInt();

        int simpleintrest=amount+(amount*intrest*time)/100;
        System.out.println("final "+simpleintrest);
        }}