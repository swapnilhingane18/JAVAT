import java.util.Scanner;

public class B3Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println(a > b && b > 1 || a % b == 0 && !(a < 10));

        sc.close();
    }
}
