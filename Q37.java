import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_sal = sc.nextInt();

        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int r3 = sc.nextInt();

        int total_ration = r1 + r2 + r3;

        int thirdShare = (total_sal * r3) / (r1 + r2 + r3);

        System.out.println(thirdShare);


    }
}
