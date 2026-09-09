import java.util.Scanner;

public class B2Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();

        System.out.println(units * 5 > 1200);

        sc.close();
    }
}
