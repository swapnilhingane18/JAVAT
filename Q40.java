import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int dis1 = sc.nextInt();
        int dis2 = sc.nextInt();

        int p2 = price - (price * dis1/100);
        int p3 = p2 - (p2 * dis2/100);

        System.out.println(p3);

    }
}
