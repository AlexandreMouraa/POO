public class ATOI
{
    public int myAtoi(String s)
    {

        if(s.matches("^\\D.*"))
            return 0;

        s = s.trim();

        boolean negative = false;
        if(s.startsWith("-"))
        {
            negative = true;
            s.substring(1);
        }
        else if(s.startsWith("+"))
            s.substring(1);

        s = s.replaceAll("[^0-9-]", "");

        if(s.isEmpty())
            return 0;

        try
        {
            int num = Integer.parseInt(s);
            return num;
        }
        catch(NumberFormatException e)
        {
            return 0;
        }
    }


    //Other Solution
    public int myAtoiii(String s) 
    {
    s = s.trim();
    if (s.isEmpty()) {
        return 0;
    }

    int sign = 1;
    int startIndex = 0;
    char firstChar = s.charAt(0);

    if (firstChar == '-' || firstChar == '+') {
        startIndex++;
        if (firstChar == '-') {
            sign = -1;
        }
    }

    long result = 0;
    for (int i = startIndex; i < s.length(); i++) {
        char c = s.charAt(i);
        if (!Character.isDigit(c)) {
            break;
        }
        result = result * 10 + (c - '0');

        // Check for integer overflow
        if (result * sign > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result * sign < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
    }

    return (int) (result * sign);
}

    public static void main(String [] args)
    {
        var Solution = new ATOI();
        int num = Solution.myAtoi("      -42");
        System.out.println(num);
    }
}