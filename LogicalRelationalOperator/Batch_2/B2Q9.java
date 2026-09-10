import java.util.Scanner;

public class B2Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(), d = sc.nextInt();
        System.out.println((p - d) > 600 && p % 10 == 0);

        sc.close();
    }
}
