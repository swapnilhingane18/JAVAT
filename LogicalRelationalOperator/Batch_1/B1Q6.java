import java.util.Scanner;

public class B1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u = sc.next();
        String p = sc.next();

        System.out.println(u.equals("admin") && p.equals("1234"));

        sc.close();
    }
}
