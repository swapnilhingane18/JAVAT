import java.util.*;
public class Question24{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n = sc.nextInt();
         System.out.println("Enter the Power");
        int m = sc.nextInt();
        
        int result =1;

        for(int i=0;i<= m;i++){
             result = result * n;
        }
        System.out.println(result);

    
    }
}