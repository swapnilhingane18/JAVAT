import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sp = sc.nextDouble();
        double profit = sc.nextDouble();

        double cp = (sp * 100) / (100 + profit);

        System.out.println(cp);
    }
}
