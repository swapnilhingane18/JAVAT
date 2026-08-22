import java.util.Scanner;

public class Demo10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SUB 1 MARKS ");
        int sub1=sc.nextInt();
        System.out.println("ENTER SUB 2 MARKS ");
        int sub2=sc.nextInt();
        System.out.println("ENTER SUB 3 MARKS ");
        int sub3=sc.nextInt();

        int average=(sub1+sub2+sub3)/3;
        System.out.println("average is "+average);
        }}
       