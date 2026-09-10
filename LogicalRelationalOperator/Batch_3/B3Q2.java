import java.util.Scanner;

public class B3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), p = sc.nextInt();

        System.out.println(m / p > 8 && m % p == 40);

        sc.close();
    }
}
