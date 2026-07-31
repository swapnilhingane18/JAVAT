public class Multiply{
    public static int  Mult(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        int a=5;
        int b=10;
        int prod = Mult(a, b);
        System.out.println(prod);
        prod = Mult(10,20);
        System.out.println(prod);
    }
}