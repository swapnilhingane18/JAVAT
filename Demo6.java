import java.util.Scanner;
public class Demo6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your product price");
        int product =sc.nextInt();

        System.out.println("Enter discount");
        int discount =sc.nextInt();

        int finalprice1=product-(product* discount/100);
        

        System.out.println("Final price is "+finalprice1);
    }}