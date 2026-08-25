public class Demo{
    public static void main(String[] args){
        byte a=65;
        short b=a;
        char c=(char)b;
        int d=c;
        long e=d;
        float f=e;
        double g=f;

        double z=80.5;
        float y =(float)z;
        long x=(long)y;
        int w=(int)x;
        short v =(short)w;
        char u =(char)v;
        byte p =(byte)u;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(" ");

        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
        System.out.println(w);
        System.out.println(v);
        System.out.println(u);
        System.out.println(p);
       
    }
}