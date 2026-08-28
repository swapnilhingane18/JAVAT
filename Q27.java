import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fuel_cost = sc.nextInt();
        int total_distance = sc.nextInt();

        int cost_per_km = fuel_cost / total_distance;

        System.out.println(cost_per_km);
    }
}
