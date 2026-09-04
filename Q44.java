import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cost = sc.nextInt();
        int price_per_litre = sc.nextInt();
        int mileage = sc.nextInt();

        int total_dist = (cost/price_per_litre) * mileage;

        System.out.println(total_dist);
    }
}
