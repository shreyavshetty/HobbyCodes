/**
QuestionLink : https://leetcode.com/problems/product-of-array-except-self/
Time Complexity = O(n) n- size of array
Space Complexity = O(1)
**/
import java.util.*;
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums == null || nums.length==0)
        {
            return -1;
        }
        if(nums.length==1)
        {
            return 0;
            
         }
         if(nums[0]>nums[1])
        {
            return 0;
        }
        int i;
        for(i=1;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
            {
                return i;
            }
        }
        if(nums[i]>nums[i-1])
        {
            return i;
        }
       
        return -1;
        
    }
}