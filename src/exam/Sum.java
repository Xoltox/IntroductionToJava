package exam;

class Sum
{
    public static void main(String args[])
    {
        int[] GivenArray = {1, 2, 3, 4};
        int Sum = 0;

        for (int Count = 0; Count < GivenArray.length; Count ++)
        {
            Sum += GivenArray[Count];
        }

        System.out.println("Sum = " + Sum);
    }
}