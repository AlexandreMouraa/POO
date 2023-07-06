public class Zigzag
{
  public String convert(String s, int numRows)
  {
    
      StringBuilder[] sb = new StringBuilder[numRows];
  
      for(int i = 0; i < numRows; i++)
              sb[i] = new StringBuilder();

      char [] array = s.toCharArray();
      int n = array.length;
      int index = 0;

      while(index < n)
      {
          for(int j = 0; j < numRows && index < n; j++)
                sb[j].append(array[index++]);

          for(int j = numRows - 2; j > 0 && index < n; j--)
                sb[j].append(array[index++]);
      }


      StringBuilder res = sb[0]; 
      for(int i = 1; i < numRows; i++)
            res.append(sb[i].toString());
    
      return res.toString();
  }
 

  public static void main(String [] args)
  {
    var Solution = new Zigzag();
    Solution.convert("PAYPALISHIRING", 4);
    System.out.println(Solution);
  }

}