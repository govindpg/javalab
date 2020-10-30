import java.io.*;
    public class Program4{
        public static void main(String[] args){
            int n1=2;
            Prime(n1);
        }
        static void Prime(int n)
        {
            int temp=0,p=0,i;
            for(i=2;i<=n/2;i++)
            {
                temp=n%i;
                if(temp==0)
                {
                    p=1;
                    break;
                }
            }
            if(p==0)
                System.out.println(n + " is a Prime Number");
            else
                System.out.println(n + " is not a Prime Number");
        }


    }

