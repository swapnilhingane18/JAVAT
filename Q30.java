import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();

        int days = (minutes / 60) / 24;

        System.out.println(days);
    }
}
