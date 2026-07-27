//factorial code

import java.util.*;
public class Question21{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);

System.out.println("Enter a number");
int n=sc.nextInt();

int count=1;

for(int i=1;i<=n;i++){
count = count*i;
}
System.out.println(count);
}
}