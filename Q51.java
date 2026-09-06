import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        int cost = sc.nextInt();

        System.out.println(l * b * h * cost);
    }
}
