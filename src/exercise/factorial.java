package exercise;

import java.util.Scanner;

public class factorial
{
    public static void main (String args[])
    {
        int Number;
        long Factorial = 1;

        Scanner Input = new Scanner (System.in);
        
        System.out.print("Enter the number you want to find factoiral of -");
        Number = Input.nextInt();

        for(int Count = 1; Count <= Number; ++Count)
        {
            Factorial *= Count;
        }

        System.out.printf("The Factorial of the number %d is %d", Number, Factorial);
    }
}