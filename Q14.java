import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();

        int rate = sc.nextInt();

        int interest = p + (p * rate/100);

        int compund_interest = interest + (interest * rate/100);

        System.out.println(compund_interest);
    }
}
