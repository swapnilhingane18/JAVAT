import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mixture = sc.nextDouble();

        double juice_percent = sc.nextDouble();

        double added_juice = sc.nextDouble();

        double pure_juice = mixture * juice_percent / 100;

        double newPercentage = (pure_juice + added_juice) / (mixture + added_juice) * 100;

        System.out.println(newPercentage);


    }
}
