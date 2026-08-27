import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sp1 = sc.nextInt();
        int sp2 = sc.nextInt();

        int avgSpeed = (2 * sp1 * sp2) / (sp1 + sp2);

        System.out.println(avgSpeed);
    }
}
