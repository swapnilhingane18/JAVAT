import java.util.Scanner;

public class B2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        int overs = sc.nextInt();

        System.out.println(runs/overs > 4);

        sc.close();
    }
}
