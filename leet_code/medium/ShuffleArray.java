/**
QuestionLink : https://leetcode.com/problems/shuffle-an-array/
Time Complexity = O(n) n- size of array
Space Complexity = O(n)
**/
import java.util.*;
class Solution {

    int[] original;
    int[] onReset;
    int size = 0;
    Random rand = new Random();
    public Solution(int[] nums) {
        
        original = nums;
        onReset = original.clone();
        size = nums.length;
        
    }
    public void swap(int n1, int n2, int []arr)
    {
        int temp = arr[n2];
        arr[n2] = arr[n1];
        arr[n1] = temp;
    }
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        
        return onReset;
        
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        
        for(int i=0;i<size;i++)
        {
            swap(i, rand.nextInt((size)), original);
        }
        return original;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */