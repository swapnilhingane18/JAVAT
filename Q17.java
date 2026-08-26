import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int base = sc.nextInt();
        int per_km = sc.nextInt();
        int discount = sc.nextInt();

        System.out.println(base + (per_km * discount));
    }
}
