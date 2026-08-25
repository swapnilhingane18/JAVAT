import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int distance = sc.nextInt();
        int mileage = sc.nextInt();
        int petrol_price = sc.nextInt();
        int toll = sc.nextInt();

        int fuel = distance / mileage;
        int cost = fuel * petrol_price;

        System.out.println(cost + toll);
    }
}
