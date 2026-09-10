import java.util.Scanner;

public class B2Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int days = sc.nextInt();

        System.out.println(d * days > 40);

        sc.close();
    }
}
