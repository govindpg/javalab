import java.io.*;
public class Program8{
    public static void main(String[] args) {
        int n=20,i=1;
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
OUTPUT
Factorial of 1 = 1
Factorial of 2 = 2
Factorial of 3 = 6
Factorial of 4 = 24
Factorial of 5 = 120
Factorial of 6 = 720
Factorial of 7 = 5040
Factorial of 8 = 40320
Factorial of 9 = 362880
Factorial of 10 = 3628800
Factorial of 11 = 39916800
Factorial of 12 = 479001600
Factorial of 13 = 1932053504
Factorial of 14 = 1278945280
Factorial of 15 = 2004310016
Factorial of 16 = 2004189184
Factorial of 17 = -288522240
Factorial of 18 = -898433024
Factorial of 19 = 109641728
Factorial of 20 = -2102132736
