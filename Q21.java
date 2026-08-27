import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double finalPrice = sc.nextDouble();
        double discount = sc.nextDouble();

        double originalPrice = (finalPrice * 100) / (100 - discount);

        System.out.println((int) originalPrice);
    }
}
