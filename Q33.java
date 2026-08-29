import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q1 = sc.nextInt();
        int p1 = sc.nextInt();

        int q2 = sc.nextInt();
        int p2 = sc.nextInt();

        int avg_price = ((q1 * p1) + (q2 * p2)) / (q1 + q2);

        System.out.println(avg_price);
    }
}
