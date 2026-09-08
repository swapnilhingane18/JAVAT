import java.util.Scanner;

public class B1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        int rent = sc.nextInt();

        System.out.println((salary - rent) > 15000);

        sc.close();
    }
}
