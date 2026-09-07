import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_time = sc.nextInt();
        int tasks = sc.nextInt();

        System.out.println(total_time/tasks);
    }
}
