import java.io.*;
public class Program6 {
    public static void main(String[] args) {

            int number = 100;

            System.out.print("Factors of " + number + " are:-");
            for (int i = 1; i <= number; ++i) {

                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

OUTPUT
Factors of 100 are:-1 2 4 5 10 20 25 50 100 
