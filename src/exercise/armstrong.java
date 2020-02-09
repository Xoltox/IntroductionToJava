package exercise;

import java.util.Scanner;

public class armstrong
{
    public static void main (String args[])
    {
        int Sum, Cube, Number, Hold;
        Sum = 0;
        Scanner Input = new Scanner (System.in);

        System.out.println("Enter the number you want to check -");
        Number = Input.nextInt();

        Hold = Number;

        while(Number > 0)
        {
            Cube = Number % 10;
            Number = Number / 10;
            Sum += (Cube * Cube * Cube);
        }

        if(Hold == Sum)
        {
            System.out.println("The given number is an Armstrong Number");
        }
        else
        {
            System.out.println("The given number is not an Armstrong Number");
        }
    }
}