//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//An input string is valid if:

//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.

import java.util.Map;
import java.util.HashMap;

public class ValidParentheses 
{
    public boolean isValid(String s) 
    {
        Map<Character, Character> Brackets = new HashMap<>();
        Brackets.put('[', ']');
        Brackets.put('{', '}');
        Brackets.put('(', ')');

        char expectedClosing = ' ';

        for(char letra : s.toCharArray())
        {
            //If it's an opening bracket, update the expected closing bracket
            if(Brackets.containsKey(letra))
                expectedClosing = Brackets.get(letra);
            
            else if(Brackets.containsValue(letra))
            {
                if(expectedClosing == ' ' || expectedClosing != letra) return false;

                expectedClosing = ' ';
            }
        }

        return expectedClosing == ' ';   
    }
}


//Input: s = "()[]{}"
//Output: true

//Input: s = "(]"
//Output: false