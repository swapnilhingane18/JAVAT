import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cost = sc.nextInt();
        int charge = sc.nextInt();
        int friends = sc.nextInt();

        int amount = cost + (cost * charge/100);

        int split_amount = amount/friends;

        System.out.println(split_amount);
    }
}
