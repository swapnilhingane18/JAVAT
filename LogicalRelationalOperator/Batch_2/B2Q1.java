import java.util.Scanner;

public class B2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int d = sc.nextInt();
        int t = sc.nextInt();

        System.out.println((p - d + t ) > 700);

        sc.close();
    }
}
