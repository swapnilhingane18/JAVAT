//count of odd terms

import java.util.*;
public class Arrays9{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int count=0;
int[] arr = new int[5];
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++){
if(arr[i]%2!=0){
count ++;
}
}
System.out.println(count);
}}