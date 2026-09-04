import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int final_value = sc.nextInt();
        int percent = sc.nextInt();

        int org_value = (final_value * 100)/125;

        System.out.println(org_value);
    }
}
