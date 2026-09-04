import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextInt();

        double r1 = sc.nextInt();
        double r2 = sc.nextInt();
        double r3 = sc.nextInt();

        double total_ratio = r1 + r2 + r3;

        double share1 = (r1/total_ratio) * num;
        double share2 = (r2/total_ratio) * num;
        double share3 = (r3/total_ratio) * num;

        System.out.println(share1 + " " + share2 + " " + share3);
    }
}
