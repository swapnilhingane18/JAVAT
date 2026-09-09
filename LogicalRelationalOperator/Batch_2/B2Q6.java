import java.util.Scanner;

public class B2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int sal = sc.nextInt();

        System.out.println(age >= 21 && sal >= 20000);
        
        
        sc.close();
    }
}
