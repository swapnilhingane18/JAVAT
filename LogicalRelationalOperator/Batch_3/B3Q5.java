import java.util.Scanner;

public class B3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(n % 2 == 0 && n % 5 == 0 || n % 3 == 0);

        sc.close();
    }
}
