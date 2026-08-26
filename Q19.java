import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double obtained = sc.nextInt();
        double total = sc.nextInt();

        double percentage = (obtained/total) * 100;

        System.out.println(percentage);
    }
}
