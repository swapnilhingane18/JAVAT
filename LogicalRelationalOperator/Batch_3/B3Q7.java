import java.util.Scanner;

public class B3Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println(a + b * c > 100 && b/c == 4 || a % c == 0);

        sc.close();
    }
}
