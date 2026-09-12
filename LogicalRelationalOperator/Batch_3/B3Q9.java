import java.util.Scanner;

public class B3Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(), d = sc.nextInt();

        System.out.println((p - d) > 800 && p % 10 == 9);

        sc.close();
    }
}
