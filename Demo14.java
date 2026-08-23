import java.util.Scanner;

public class Demo14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cost=sc.nextInt();
        int selling=sc.nextInt();

        int profit=selling-cost;
        double profitper=(profit*100/cost);
        System.out.println(profitper);

        }}