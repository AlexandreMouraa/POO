///Difficulty:                       HARD


//You are given a string text. You should split it to k substrings (subtext1, subtext2, ..., subtextk) such that:

//subtexti is a non-empty string.
//The concatenation of all the substrings is equal to text (i.e., subtext1 + subtext2 + ... + subtextk == text).
//subtexti == subtextk - i + 1 for all valid values of i (i.e., 1 <= i <= k).
//Return the largest possible value of k.


public class LongestDecomposition 
{
    public int longestDecomposition(String text) 
    {
        int n = text.length();
        return helper(text, 0, n - 1, new Integer[n][n]);
    }

    private int helper(String text, int left, int right, Integer[][] memo) 
    {
        if (left > right)
            return 0;
        if (left == right)
            return 1;

        if (memo[left][right] != null)
            return memo[left][right];

        int maxK = 1;
        for (int i = left; i < right; i++) 
        {
            if (text.substring(left, i + 1).equals(text.substring(right - i + left, right + 1))) 
            {
                int currK = 2 + helper(text, i + 1, right - i + left - 1, memo);
                maxK = Math.max(maxK, currK);
            }
        }

        memo[left][right] = maxK;
        return maxK;
    }    
}

//Input: text = "ghiabcdefhelloadamhelloabcdefghi"
//Output: 7
//Explanation: We can split the string on "(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)".


///Another resoltuion i've finded on the comments(Witch is way more efficient)
class AnotherSolution
{
    public int longestDecompositionn(String text) 
    {
        int n = text.length();   
        for (int i = 0; i < n/2; i++) 
            if (text.substring(0, i + 1).equals(text.substring(n-1-i, n))) 
                return 2+longestDecompositionn(text.substring(i+1, n-1-i));
        return (n==0)?0:1;
    }
}
