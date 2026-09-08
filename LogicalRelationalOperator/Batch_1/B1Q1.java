import java.util.Scanner;

public class B1Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int discount = sc.nextInt();

        System.out.println((price - discount) >= 400);

        sc.close();
    }
}
