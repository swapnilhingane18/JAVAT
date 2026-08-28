import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();

        double inc1 = price + (price * 0.1);
        double inc2 = inc1 + (inc1 * 0.2);

        System.out.println(inc2);
    }
}
