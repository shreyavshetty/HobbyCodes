public class TrappingRainWater {

    // Time complexity : O(n)
    // Space Complexity : O(1)
    public int trap1(int[] height) {
        
        if(height==null || height.length==0)
            return 0;
        
        int n = height.length;
        int left = 0;
        int right = n-1;
        int left_max = 0;
        int right_max = 0;
        int result = 0;
        while(left<right)
        {
            if(height[right]>height[left])
            {
                if(height[left]>=left_max)
                    left_max = height[left];
                else
                    result += left_max - height[left];
                left++;
            }
            else
            {
                if(height[right]>=right_max)
                    right_max = height[right];
                    else
                        result += right_max -  height[right];
                    right--;
                }
            }
            return result;
        }
    
    // Time complexity : O(n)
    // Space Complexity : O(n)
    public int trap(int[] height) {
        
        if(height==null || height.length==0)
            return 0;
        
        int n = height.length;
        int []left = new int[n];
        left[0] = height[0];
        for(int i=1;i<n;i++)
        {
            left[i] = Math.max(height[i], left[i-1]);     
        }
        int []right = new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i] = Math.max(height[i], right[i+1]);     
        }
        int result = 0;
        for(int i=0;i<n;i++)
        {
            result += Math.min(left[i], right[i]) - height[i];
        }
        return result;
        
    }
    
}
