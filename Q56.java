import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m1 = sc.nextDouble();
        double w1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double w2 = sc.nextDouble();

        double score = (m1 * w1 + m2 * w2) / (w1 + w2);

        System.out.println(score);
    }
}
