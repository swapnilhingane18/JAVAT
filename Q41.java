import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double taxed_amount = sc.nextDouble();
        double tax = sc.nextDouble();

        double original = (taxed_amount * 100) / (100 + tax);

        System.out.println(original);
    }
}
