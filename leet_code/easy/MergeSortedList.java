/**
QuestionLink : https://leetcode.com/problems/merge-sorted-array
Time Complexity = O(m+n)
Space Complexity = O(1)
Notes : Backward iteration - since iterating from indx 0 would result in shifting each elemets 
and time complexity would not be linear.
**/
import java.util.*
class MergeSortedList{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int s = m+n-1;
        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]<nums2[j])
            {
                nums1[s] = nums2[j];
                s--;
                j--;
            }
            else
            {
                nums1[s] = nums1[i];
                nums1[i] = 0;
                s--;
                i--;
                
            }
        }
        if(nums1[0] == 0 && s == 0)
        {
            nums1[0] = nums2[0];
        }
        while(i>=0 && j==-1)
        {
            nums1[s] = nums1[i];
            s--;
            i--;
        }
        while(j>=0 && i==-1)
        {
            nums1[s] = nums2[j];
            s--;
            j--;
        }
        
    }
}