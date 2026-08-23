import java.util.Scanner;

public class Demo13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chocklates=sc.nextInt();
        int students=sc.nextInt();

        int share=chocklates/students;
        int left =chocklates%students;

        System.out.println("share "+share);
        System.out.println("left"+left);
        


        }}