import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        
        int r1 = sc.nextInt();

        int r2 = sc.nextInt();

        int firstShare = (total * r1) / (r1 + r2);


        System.out.println(firstShare);

    }
}
