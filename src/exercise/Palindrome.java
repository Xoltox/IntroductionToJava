package exercise;

import java.util.Scanner;

public class Palindrome
{
    public static void main (String args[])
    {
        int Remainder, Sum, Hold, Number;
        Sum = 0;

        Scanner Input = new Scanner (System.in);

        System.out.print("Enter the number you want to check for - ");
        Number = Input.nextInt();

        Hold = Number;

        while(Number > 0)
        {
            Remainder = Number % 10;
            Sum = (Sum * 10) + Remainder;
            Number = Number / 10;
        }

        if(Hold == Sum)
        {
            System.out.println("The given number is a Palindrome Number");
        }
        else
        {
            System.out.println("The given number is not a Palindrome Numebr");
        }
    }
}