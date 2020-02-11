package exam;

import java.util.Scanner;

class Count
{
    public static void main(String args[])
    {
        String GivenString = "";
        int Vowels = 0, Consonants = 0;
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Enter the string you want to count the vowels and consonants for - ");
        GivenString = Input.nextLine();
        Input.close();
        GivenString = GivenString.toLowerCase();

        for(int Count = 0; Count < GivenString.length(); Count++)
        {
            if(GivenString.charAt(Count) == 'a' || GivenString.charAt(Count) == 'e' || GivenString.charAt(Count) == 'i' || GivenString.charAt(Count) == 'o' || GivenString.charAt(Count) == 'u')
            {
                Vowels++;
            }
            else
            {
                Consonants++;
            }
        }

        System.out.println("In the given string" + GivenString +"there are " + Vowels + " vowels and " + Consonants + " consonants");
    }
}