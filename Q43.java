import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hrs = sc.nextInt();
        int min = sc.nextInt();

        int sec = ((hrs * 60) * 60) + (min * 60);

        System.out.println(sec);
    }
}
