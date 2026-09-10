import java.util.Scanner;

class B3Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(), d = sc.nextInt(), t = sc.nextInt();
        System.out.println(p - d + t > 1000);

        sc.close();
    }
}