import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sp = sc.nextInt();
        int profit = sc.nextInt();

        int cp = (sp * 100) / (100 + profit);

        System.out.println(cp);
    }
}
