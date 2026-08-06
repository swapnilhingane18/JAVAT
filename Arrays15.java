import java.util.*;

public class Arrays15 {
public static void main(String args[]){

int[] arr = new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}

int test=0;
for(int i=0;i<arr.length-1;i++){
if(arr[i]>arr[i+1]){
test=0;
break;
}else{
    test=-1;
}
}
if(test==-1){
System.out.println("Sorted");
}else{
System.out.println("Not Sorted");
}
}
