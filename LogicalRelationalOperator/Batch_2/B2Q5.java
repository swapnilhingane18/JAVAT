import java.util.Scanner;

public class B2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();

        System.out.println(price % 100 == 0);

        sc.close();
    }
}
