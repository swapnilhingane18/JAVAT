import java.util.Scanner;
public class Demo4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 4 digit number");

        int num =sc.nextInt();
        int sum=0,rem=0,dup=num;

        //1
        rem=num%10;
        sum=sum+rem;
        num=num/10;

        //2
        rem=num%10;
        sum+=rem;
        num/=10;

        // 3
        rem=num%10;
        sum+=rem;
        num/=10;
         
         //4
        rem=num%10;
        sum+=rem;
        num/=10;
        System.out.println("rem "+ rem);
        System.out.println("sum "+ sum);
        System.out.println("num "+ num);

    }
}