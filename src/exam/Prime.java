package exam;

class Prime
{
    public static void main(String args[])
    {
        for(int Count = 2; Count < 100; Count++)
        {
            boolean Prime = true;
            for(int InnerCount = 2; InnerCount < Count; InnerCount++)
            {
                if(Count % InnerCount == 0)
                {
                    Prime = false;
                }
            }
            if(Prime)
            {
                System.out.print(Count + ", ");
            }
        }
    }
}