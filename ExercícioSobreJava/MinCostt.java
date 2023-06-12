///Difficulty:                       MEDIUM


//You are given a 0-indexed integer array nums of size n representing the cost of collecting different chocolates. 
//Each chocolate is of a different type, and originally, the chocolate at ith index is of ith type.

//In one operation, you can do the following with an incurred cost of x:

//Simultaneously change the chocolate of ith type to (i + 1)th type for all indexes i where 0 <= i < n - 1. 
//When i == n - 1, that chocolate will be changed to type of the chocolate at index 0.
//Return the minimum cost to collect chocolates of all types, 
//given that you can perform as many operations as you would like.

//THIS ONE I REALLY DIDN'T KNOW HOW TO DO IT, SO THE FIRST IS MINE 
//AND THE SECOND I CHECKED IN THE SOLUTIONS OF OTHERS WHO SOLVED

public class MinCostt 
{
    //MY SOLUTION WITCH IS WRONG, the output of the example keeps returning 14 for me, not 13
    public long minCost(int[] nums, int x) 
    { 
        int n = nums.length;
        long[] prefixSum = new long[n];
        long totalSum = 0;

        // Calculate the prefix sum array
        for (int i = 0; i < n; i++) 
        {
            prefixSum[i] = nums[i];
            totalSum += nums[i];
        }

        // Calculate the minimum cost for each possible starting index
        long minCost = totalSum;
        for (int i = 0; i < n; i++) 
        {
            long currCost = prefixSum[i];
            int j = i + 1;
            while (j < n && currCost + x >= prefixSum[j]) 
            {
                currCost += x;
                currCost -= nums[j];
                minCost = Math.min(minCost, currCost);
                j++;
            }
            if (j < n) 
                minCost = Math.min(minCost, totalSum - currCost);
        }

        return minCost;
    }



    //THE CORRECT ONE, FROM PEOPLE WHO SOLVED THE QUESTION
    public long minCosttttt(int[] A, int x) {
        int n = A.length;
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] += 1L * i * x;
            int cur = A[i];
            for (int k = 0; k < n; k++) {
                cur = Math.min(cur, A[(i - k + n) % n]);
                res[k] += cur;
            }
        }

        long min_res = Long.MAX_VALUE;
        for (long element : res) {
            min_res = Math.min(min_res, element);
        }

        return min_res;
    }
}

//Input: nums = [20,1,15], x = 5
//Output: 13
//Explanation: Initially, the chocolate types are [0,1,2]. We will buy the 1st type of chocolate at a cost of 1.
//Now, we will perform the operation at a cost of 5, and the types of chocolates will become [2,0,1]. 
//We will buy the 0th type of chocolate at a cost of 1.
//Now, we will again perform the operation at a cost of 5, and the chocolate types will become [1,2,0]. 
//We will buy the 2nd type of chocolate at a cost of 1. 
//Thus, the total cost will become (1 + 5 + 1 + 5 + 1) = 13. We can prove that this is optimal.
