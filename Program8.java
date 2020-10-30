import java.io.*;
public class Program8{
    public static void main(String[] args) {
        int n=10,i=1;
        Program8 fact = new Program8();
        while(i<=n)
        {
            fact.Fact(i);
            i++;
        }
    }
    void Fact(int n){
        int i=1,a=1;
        while(i<=n)
        {
            a*=i;
            i++;
        }
        System.out.println("Factorial of "+n+" = "+a);
    }
}
