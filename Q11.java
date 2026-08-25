import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sal = sc.nextInt();
        int bonus = sc.nextInt();
        int tax = sc.nextInt();

        int res = (sal + bonus) - ((sal + bonus) * tax/100);

        System.out.println(res);
    }
}
