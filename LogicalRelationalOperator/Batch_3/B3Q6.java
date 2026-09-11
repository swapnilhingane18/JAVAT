import java.util.Scanner;

public class B3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        System.out.println(!(m >= 35) && m % 2 == 0);

        sc.close();
    }
}
