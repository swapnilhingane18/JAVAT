import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int amount = sc.nextInt();

        int discount = sc.nextInt();

        double discount_price = amount - (amount * discount/100);

        int gst = sc.nextInt();

        double taxed_price = discount_price + (discount_price * gst/100);

        System.out.println(taxed_price);
    }
}
