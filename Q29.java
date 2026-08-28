import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();

        double rate = sc.nextDouble();

        double a1 = amount + (amount * rate/100);

        double a2 = a1 + (a1 * rate/100);

        double a3 = a2 + (a2 * rate/100);

        System.out.println(a3);
    }   
}
