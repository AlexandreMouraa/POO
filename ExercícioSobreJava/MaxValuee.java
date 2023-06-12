///Difficulty:                       MEDIUM

//You are given three positive integers: n, index, and maxSum. 
//You want to construct an array nums (0-indexed) that satisfies the following conditions:
//nums.length == n
//nums[i] is a positive integer where 0 <= i < n.
//abs(nums[i] - nums[i+1]) <= 1 where 0 <= i < n-1.
//The sum of all the elements of nums does not exceed maxSum.
//nums[index] is maximized.
//Return nums[index] of the constructed array.

//Note that abs(x) equals x if x >= 0, and -x otherwise.

public class MaxValuee 
{
    
     public int maxValue(int n, int index, int maxSum) 
     {
        int left = 1;
        int right = maxSum;

        while (left < right) 
        {
            int mid = left + (right - left + 1) / 2;

            if (isPossible(n, index, maxSum, mid)) 
            {
                left = mid;
            } 
            else 
            {
                right = mid - 1;
            }
        }

        return left;
    }

    private boolean isPossible(int n, int index, int maxSum, int mid) 
    {
        long sum = mid;
        int left = index;
        int right = n - index - 1;

        long leftSum = getSumContribution(mid - 1, Math.min(left, mid - 1));
        long rightSum = getSumContribution(mid - 1, Math.min(right, mid - 1));

        sum += leftSum + rightSum;

        if (left >= mid)
            sum += (long)(left - (mid - 1));

        if (right >= mid)
            sum += (long)(right - (mid - 1));

        return sum <= maxSum;
    }

    private long getSumContribution(int val, int count) 
    {
        long sum = 0;
        int numPairs = Math.min(val, count);
        sum += (long)(val + val - numPairs + 1) * numPairs / 2;

        if (count > numPairs)
            sum += (long)(count - numPairs);

        return sum;
    }
}



