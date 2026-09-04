import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextInt();
        double lossPercent = sc.nextInt();

        double loss = (lossPercent/100) * price;

        double sp = price - loss;

        System.out.println(sp);
    }
}
