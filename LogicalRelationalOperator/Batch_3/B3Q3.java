import java.util.Scanner;

public class B3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), r = sc.nextInt(), f = sc.nextInt();

        System.out.println(s - r + f >= 30000);

        sc.close();
    }
}
