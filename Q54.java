import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();
        int cost = sc.nextInt();

        System.out.println(side * side * cost);
    }
}
