import java.io.*;
public class Program7{
    static int a=0,b=1,c=0;
    static void p(int n){
        if(n>0){
            c = a + b;
            a = b;
            b = c;
            System.out.print(" "+c);
            p(n-1);
        }
    }
    public static void main(String args[]){
        int n=10;
        System.out.print(a+" "+b); p(n-2);
    }
}
