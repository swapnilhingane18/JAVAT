import java.util.Scanner;

public class Demo15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");       
        int number=sc.nextInt();

    int dup=number;

    int lastdigit=number%100;
    
    
    int div=10000;
    int firstdigit=number/div;
   

    System.out.println("first digit "+ firstdigit+"  last digit "+lastdigit);

    number=number-(lastdigit-firstdigit);
    number=number+(lastdigit-firstdigit)*div;
    System.out.println("original num :"+dup+"original num :"+number );


    }}