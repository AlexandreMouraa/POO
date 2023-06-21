//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

//The overall run time complexity should be O(log (m+n)).

public class MergeArrays 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m = nums1.length;
        int n = nums2.length;
        int [] merged = new int[m + n];

        int k = 0, i = 0, j = 0;

        for(; i < m && j < n; k++)
        {
            if(nums1[i] < nums2[j])
                merged[k] = nums1[i++];
 
            else
                merged[k] = nums2[j++];
        }

        while(i < m)
            merged[k++] = nums1[i++];

        while(j < n)
            merged[k++] = nums2[j++];

        int mid = (m + n)/2;
        if(merged.length % 2 == 0)
            return (merged[mid] + merged[mid - 1])/2.0;
        else
            return merged[mid];

    }
    
    public static void main(String [] args)
    {
        int [] nums = {1, 2};
        int [] nums2 = {3, 4};

        var Solution = new MergeArrays();
        System.out.println(Solution.findMedianSortedArrays(nums, nums2));
    }
}


//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.