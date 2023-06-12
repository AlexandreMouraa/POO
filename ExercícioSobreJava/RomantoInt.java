//Given a roman numeral, convert it to an integer.

import java.util.Map;
import java.util.HashMap;


public class RomantoInt 
{

    public int romanToInt(String s) 
    {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        int Previousvalue = 0;
        int result = 0;

        for(int i = s.length()- 1; i >= 0; i--)
        {
            int CurrentValue = map.get(s.charAt(i));

            if(CurrentValue < Previousvalue)
                result -= CurrentValue;

            else
                result += CurrentValue;

            Previousvalue = CurrentValue;
        }

        return result;   
    }

    
    
}

//Input: s = "III"
//Output: 3
//Explanation: III = 3.

//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.
