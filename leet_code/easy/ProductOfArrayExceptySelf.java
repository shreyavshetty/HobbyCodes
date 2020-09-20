class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] lmult = new int[nums.length];
        int rmult = nums[nums.length-1];
        lmult[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            lmult[i] = nums[i]*lmult[i-1];
        }
        lmult[nums.length-1] = lmult[nums.length-2];
        for(int i=nums.length-2;i>0;i--)
        {
            lmult[i] = lmult[i-1]*rmult;
            rmult *= nums[i];
        }
        lmult[0] = rmult;
        
        return lmult;
    }
}


