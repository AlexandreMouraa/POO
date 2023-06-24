import java.util.HashSet;
import java.util.Set;

public class LongestPalindromeSub 
{
    public String longestPalindrome(String s) 
    {
        Set<Character> LongestPalindrome = new HashSet<>();

        int cont = 0;
        int right = s.length();

        for(int i = 0; i < s.length(); i++)
        {
            if(!LongestPalindrome.contains(s.charAt(i)))
                LongestPalindrome.add(s.charAt(i));
            else
            {
                Math.max(cont, Mapping(s.charAt(i), right).length());
            }
        }

        return "";
    }


    private String Mapping(char Letter, int size)
    {

        for(int i = size; i >= 0; i--)
        {

        }

        return "";
    }
}
