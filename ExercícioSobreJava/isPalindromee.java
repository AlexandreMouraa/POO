///Difficulty:                       EASY


//Given an integer x, return true if x is a 
//palindrome
//, and false otherwise.


public class isPalindromee 
{
    //My resolution
    public boolean isPalindrome(int x) 
    {

        String str = String.valueOf(x);

        int right = str.length() - 1;

        for(int i = 0, j = right; i < j; i++, j--)
        {
            if(str.charAt(i) != str.charAt(j))
                return false;
        }

        return true; 
    }

    //An Minor resolution and faster
    public boolean Palidrom(int x)
    {
        String str = String.valueOf(x);
        StringBuilder Frase = new StringBuilder(str);

        return Frase.reverse().toString().equals(str);
    }

    //Or another suggestion without converting into a string
    public boolean Paliidrom(int x)
    {

        int xO = x, xN = 0;

        while(x > 0)
        {
            int R = x % 10;
            xN = xN * 10 + R;
            x = x/10; 
        }

        if(xO == xN) return true;
        return false;
    }
}


