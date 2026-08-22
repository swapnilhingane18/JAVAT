import java.util.Scanner;
public class Demo9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        double distance = sc.nextDouble();
        double mileage = sc.nextDouble();
        double price=sc.nextDouble();

        double fuel=distance/mileage;
        double cost=fuel*price;
        
        System.out.println("cost "+ cost);
        }}
