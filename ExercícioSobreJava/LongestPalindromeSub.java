public class LongestPalindromeSub 
{
    public String longestPalindrome(String s) 
    {

        if(s.length() < 2 || s == null)
            return s;

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++)
        {
            int len1 = Mapping(s, i, i);
            int len2 = Mapping(s, i, i + 1);
            int len = Math.max(len1, len2);

            if(len > end - start)
            {
                start = i - ((len - 1)/ 2);
                end = i + (len/2);
            }
        }

        return s.substring(start, end + 1);
    }

    private int Mapping(String s, int left, int right)
    {

        if(s == null ||  left > right)
            return 0;

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String [] args)
    {
        var Solution = new LongestPalindromeSub();
        String word = "abbc";
        System.out.println(Solution.longestPalindrome(word));
    }
}
