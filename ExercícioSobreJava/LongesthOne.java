//Given a string s, find the length of the longest 
//substring
//without repeating characters.

import java.util.HashSet;
import java.util.Set;

public class LongesthOne 
{
        public int lengthOfLongestSubstring(String s) 
        {
            int cont = 0;
            int left = 0;

            Set<Character> Characters = new HashSet<>();

            for(int i = 0; i < s.length(); i++)
            {
                if(!Characters.contains(s.charAt(i)))
                {   
                    Characters.add(s.charAt(i));
                    cont = Math.max(cont, Characters.size());
                }
                else 
                {
                    if(cont >= s.length() - cont)
                        return cont;
                    else
                    {
                        left = s.indexOf(s.charAt(i), left) + 1;
                        Characters.clear();
                        for(int j = 0; j <= i; j++)
                            Characters.add(s.charAt(j));
                    }    
                }
            } 
            return cont;
        }

    public static void main(String [] args)
    {
        String s = "abcabcbb";
        var solution = new LongesthOne();
        int length = solution.lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}


//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

