public class bitabit
{
    public int reverse(int x)
    {
        int reversee = 0;

        while(x != 0)
        {
            int digit = x % 10;
            if(reversee > Integer.MAX_VALUE/10 || (reversee == Integer.MAX_VALUE/10 && digit > 7))
                return 0;
            else if(reversee < Integer.MIN_VALUE/10 || (reversee == Integer.MIN_VALUE/10 && digit < -8))
                return 0;
            reversee = reversee * 10 + digit;
            x /= 10;
        }

        return reversee;
    }       

    public static void main(String [] args)   
    {
        var Solution = new bitabit();
        int Revesed = Solution.reverse(-123);
        System.out.println(Revesed);
    }
}