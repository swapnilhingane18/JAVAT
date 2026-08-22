import java.util.Scanner;

public class Demo11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER price of product");
        int price=sc.nextInt();

        System.out.println("gst percent");
        int gst=sc.nextInt();

        int finalp=price+(price*gst)/100;
        System.out.println("final p "+finalp);
        }}