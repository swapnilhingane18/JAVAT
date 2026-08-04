//sum of odd numbers
import java.util.*;
public class Array10{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int sum=0;
int[] arr = new int[5];
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++){
if(arr[i]%2!=0){
sum=sum+arr[i];
}
}
System.out.println("The sum of the odd numbers are " + sum);
}}