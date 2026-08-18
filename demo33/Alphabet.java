import java.util.Scanner;
public class Alphabet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything ");

        char ch =sc.next().charAt(0);
        String res=(ch>=65 && ch<=90 || ch>=97 && ch<=122) ? "yes its character" :"No its not a character";
        System.out.println(ch + " " +res);   
    }}