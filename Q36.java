import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius = sc.nextDouble();
        double inc_percent = sc.nextDouble();
        double fahrenheit = (celsius * (9/5)) + 32;

        double res = fahrenheit + (fahrenheit * inc_percent/100);

        System.out.println(res);

    }
}
