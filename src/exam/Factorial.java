package exam;

import java.util.Scanner;

class Factorial
{
    public static void main(String args[])
    {
        int GivenNumber = 0;
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Enter the number you want to find the factorial for - ");
        GivenNumber = Input.nextInt();
        Input.close();

        System.out.println("The Factorial of the Given Number is - " + RFactorial(GivenNumber));       
    }

    public static int RFactorial (int GivenValue)
    {
        if(GivenValue == 0)
        {
            return 1;
        }
        else
        {
            return (GivenValue * RFactorial(GivenValue-1));
        }
        
    }
}