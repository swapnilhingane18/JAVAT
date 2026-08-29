import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w1 = sc.nextInt();
        int w2 = sc.nextInt();

        int total_days =  (w1 * w2) / (w1 + w2);   //(w1*w2)/(w1 + w2)

        System.out.println(total_days);
    }
}
