import java.io.*;
public class Program10{
    public static void main(String[] args) {
        int n1=407 ;
        Program10 ar = new Program10();
        ar.Arm(n1);
    }
    void Arm(int n)
    {
        int a=0,b,c;
        c=n;
        while(n>0)
        {
            b=n%10;
            n=n/10;
            a=a+(b*b*b);
        }
        if(c==a)
            System.out.println(c+" is an armstrong number.");
        else
            System.out.println(c+" is not an armstrong number.");
    }

}
OUTPUT
407 is an armstrong number.
