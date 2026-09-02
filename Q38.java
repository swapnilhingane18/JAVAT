import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int area = sc.nextInt();
        int cost = sc.nextInt();

        int final_cost = area * cost;

        System.out.println(final_cost);
    }
}
