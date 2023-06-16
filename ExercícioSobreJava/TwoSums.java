///Difficulty:                       EASY

//Given an array of integers nums and an integer target, 
//return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//You can return the answer in any order.

import java.util.Map;
import java.util.HashMap;

public class TwoSums 
{
    public int[] twoSum(int[] nums, int target) 
    {
         Map<Integer, Integer> map = new HashMap<>();

         for(int i = 0; i < nums.length; i++)
         {
            int complement = target - nums[i];

            if(map.containsKey(complement))
                return new int [] {map.get(complement), i};

            map.put(nums[i], i);
         }

         return new int[0];
    }

    //Another way of doing it

    public int [] twoSumms(int [] nums, int target)
    {
        int aPointer = 0;
        int bPointer = nums.length - 1;

        while(aPointer <= bPointer)
        {
            int sums = nums[aPointer] + nums[bPointer];

            if(sums > target)
                bPointer -= 1;
            else if(sums < target)
                aPointer += 1;
            else
                return new int [] {aPointer + 1, bPointer + 1};
        }

        return new int [] {aPointer+ 1, bPointer + 1};
    }
    
}

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].