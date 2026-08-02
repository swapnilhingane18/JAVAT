import java.util.*;

public class Arrays4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        boolean found = false;
        

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int num = sc.nextInt();
        for(int i=0;i<arr.length;i++){

            if(num==arr[i]){
                found = true;
                break;
               
            }
        }
           if(found){
                System.out.println("The number is present");
            }else{
                System.out.println("The number is not present");
            }
        
    }
}