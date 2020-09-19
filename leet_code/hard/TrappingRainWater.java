public class TrappingRainWater {
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
