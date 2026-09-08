import java.util.Scanner;

public class B1Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num % 5 == 0);

        sc.close();
    }
}
