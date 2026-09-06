import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wall_area = sc.nextInt();
        int brick_area = sc.nextInt();

        System.out.println(wall_area / brick_area);
    }
}
