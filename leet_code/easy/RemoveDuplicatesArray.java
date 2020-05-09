/**
QuestionLink : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Time Complexity = O(n) n- length of string
Space Complexity = O(1)
**/
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        int i = 1;
        int prev = 0;
        int size = nums.length;
        while(i<size)
        {
            if(nums[i] != nums[prev])
            {
                 
                prev++;
                nums[prev] = nums[i];
            }
            i++;
            
        }
        return prev+1;
    }
}

