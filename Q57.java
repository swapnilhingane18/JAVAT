import java.util.Scanner;

public class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate1 = sc.nextDouble();
        double rate2 = sc.nextDouble();
        double time = sc.nextDouble();

        double difference = principal * (rate1 - rate2) * time / 100;

        System.out.println(difference);
    }
}
