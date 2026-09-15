import java.util.Scanner;
class Q70{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n%2==0 && n%5==0){
            System.out.println("HiTwoHiFive");
        }
        if(n%2==0 && n%5!=0){
            System.out.println("HiTwo");
        }
        if(n%5==0 && n%2!=0){
            System.out.println("HiFive");
        }
    }
}