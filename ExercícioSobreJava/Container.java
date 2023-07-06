public class Container 
{
    public int maxArea(int[] height) 
    {

        int cont = 0, scont = 0;

        for(int i = 0; i < height.length; i++)
        {
            cont = Math.max(height[i], cont);
            scont = Math.min(height[i], cont);
        }

        int distance = Math.abs(1 - cont);
 
        return scont * distance;   
    }

    public int maxAreaa(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
        int h = Math.min(height[left], height[right]);
        int w = right - left;
        int area = h * w;
        maxArea = Math.max(maxArea, area);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxArea;
}

    public static void main(String [] args)
    {
        var solution = new Container();
        System.out.println(solution.maxAreaa(new int[] {1,2,1}));
    }
}
