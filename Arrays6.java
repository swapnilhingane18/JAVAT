//smallest number
import java.util.*;
public class Arrays6{
public static void main(String args[]){
int[] arr=new int[5];

Scanner sc = new Scanner(System.in);

for(int i=0; i<arr.length; i++){
     arr[i]=sc.nextInt();
}
int smallest =arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]<smallest){
smallest=arr[i];
}

}
System.out.println("the smallest number is "+smallest);
}}