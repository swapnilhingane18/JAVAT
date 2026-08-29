import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int car1 = sc.nextInt();
        int car2 = sc.nextInt();

        int relative_speed = car1 + car2;

        System.out.println(relative_speed);
    }
}
