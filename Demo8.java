import java.util.Scanner;
public class Demo8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of slices");
        int slices =sc.nextInt();

        System.out.println("people among shared");
        int people=sc.nextInt();

        int sliceget=slices/people;
        int remaining=slices%people;

        System.out.println("slices get "+sliceget);
        System.out.println("slice remain "+remaining);

    }}