import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        double mileage = sc.nextDouble();

        double fuelUsed = (d1 + d2 + d3) / mileage;

        System.out.println(fuelUsed);
    }
}
