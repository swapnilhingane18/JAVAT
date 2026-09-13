import java.util.Scanner;

public class Demo8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input : ");

        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.print("HiTwo");
        }

        if(n % 5 == 0){
            System.out.println("HiFive");
        }
    }
}