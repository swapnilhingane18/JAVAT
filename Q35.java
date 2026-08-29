import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double usd_amount = sc.nextDouble();

        double conv_rate = sc.nextDouble();

        double conv_fee = sc.nextDouble();

        double inr = usd_amount * conv_rate;

        double final_amount = inr + (inr * conv_fee/100);

        System.out.println(final_amount);
    }
}
