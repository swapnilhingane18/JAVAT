import java.util.Scanner;

public class B1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt(), price = sc.nextInt();

        System.out.println(money / price >= 10);

        sc.close();
    }
}
