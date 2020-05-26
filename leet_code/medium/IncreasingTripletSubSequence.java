/**
QuestionLink : https://leetcode.com/problems/increasing-triplet-subsequence/
Time Complexity = O(n) 
Space Complexity = O(1)
**/
import java.util.*;
class Solution {
    public boolean increasingTriplet(int[] nums) {
       if(nums == null || nums.length <= 2)
       {
           return false;
       }
       int num1 = nums[0];
       int num2 = Integer.MAX_VALUE;
       for(int i=1;i<nums.length;i++)
       {
           if(nums[i]<num1)
           {
               num1 = nums[i];
           }
           else if(num1<nums[i] && nums[i]<num2)
           {
               num2 = nums[i];
           }
           else if(num2>num1 && nums[i]>num2)
           {
               return true;
           }
       }
        return false;
        
        
        
    }
}

        