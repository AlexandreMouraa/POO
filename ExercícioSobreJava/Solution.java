//Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. 
//Additionally, if the number is negative, return 0 (for languages that do have them).
//Note: If the number is a multiple of both 3 and 5, only count it once.

public class Solution 
{

  public int solution(int number) 
  {

    int solucao = 0;

    if(number < 0)
      return 0;
 
    for(int i = 2; i < number; i++)
    {
      if(i % 3 == 0 || i % 5 == 0)
        solucao += i;
    }
    return solucao;

  }
}