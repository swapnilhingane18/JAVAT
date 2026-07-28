import java.util.*;

public class Question22{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numm = sc.nextInt();

        int a=0;
        int b=1;

        for(int i=1;i<=numm;i++){
            int next=a+b;
            System.out.print(" " + next);
            a=b;
            b=next;
        }
       
    }

}