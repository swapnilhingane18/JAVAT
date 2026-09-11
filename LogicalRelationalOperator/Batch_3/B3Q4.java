import java.util.Scanner;

public class B3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), o = sc.nextInt();

        System.out.println(r / o > 6 || r % o == 5);

        sc.close();
    }
}
