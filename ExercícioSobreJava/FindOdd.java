//Given an array of integers, find the one that appears an odd number of times.
//There will always be only one integer that appears an odd number of times.
import java.util.TreeSet;
//First Solution
public class FindOdd 
{
	public static int findIt(int[] a) 
    {
    
        int odd = 0, contador = 0;
        
        for(int i : a)
        {
            for(int j : a)
            {
                if(i == j)
                    contador++;
            }
            if(contador % 2 != 0)
                odd = i;

            contador = 0;
        }

  	    return odd;
    }
}

//Second Solution
class FindOddD 
{
	public static int findIt(int[] A) 
    {   
  	int xor = 0;

    for (int i : A) 
    	xor ^= i;

    return xor;
  }
}

//Third Solution


class FindOdds 
{
    public static int findIt(int[] A) 
    {
        final TreeSet<Integer> set = new TreeSet<>();
        for (int x : A) 
        {
            if (set.contains(x)) 
                set.remove(x);
            else 
                set.add(x);
        }
        return set.first();
    }
}