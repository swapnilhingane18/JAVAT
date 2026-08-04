import java.util.*;
public class Array11{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] arr=new int[5];
int index =-1;

for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter a num you want to search");
int num=sc.nextInt();
for(int i=0;i<arr.length;i++){
if(num==arr[i]){
 index = i;
 break;
}
}
if(index!=-1){
    System.out.println("Number found at index "+ index);
}else{
    System.out.println("Not Found");
}
}}