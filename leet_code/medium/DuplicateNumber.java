/**
QuestionLink : https://leetcode.com/problems/find-the-duplicate-number
Time Complexity = O(n) n- size of array
Space Complexity = O(1)
**/
import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        
        int hare = nums[0];
        int tortoise = nums[0];
        do{
            hare = nums[nums[hare]];
            tortoise = nums[tortoise];
        }while(hare!=tortoise);
        
        tortoise = nums[0];
        while(hare!=tortoise)
        {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return hare;
    }
}