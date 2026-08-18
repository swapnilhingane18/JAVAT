import java.util.Scanner;
public class Currency{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true) { 
            System.out.println("***** Calculator *****");
            System.out.println("List of currency");
            System.out.println("\n 1.EUR \n 2.USD \n 3.GBP \n 4.PKR \n 5.SGD");
            System.out.println("Enter your option");
            int option = sc.nextInt();
            System.out.println("Enter Your amount in inr: ");
            double amt=sc.nextDouble();

            String conv=
            (option==1)?(String.format("%.2f", amt*0.0901851)+" EUR"):
            (option==2)?(String.format("%.2f", amt*0.01045999)+" USD "):
            (option==3)?(String.format("%.2f", amt*0.00773218)+" GBP "):
            (option==4)?(String.format("%.2f", amt*2.90566370)+" PKR "):
            (option==5)?(String.format("%.2f", amt*0.01325751)+" SGD "):
            "Invalid Input";

            System.out.println();
            System.out.println(amt+ " INR : "+conv);

            
        }
    }
}
