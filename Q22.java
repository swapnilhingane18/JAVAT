import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sec = sc.nextInt();

        int hrs = (sec / 60) / 60;

        System.out.println(hrs);
    }
}
