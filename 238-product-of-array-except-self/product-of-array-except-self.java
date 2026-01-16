class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[1,2,6,24]
        //
        //[24,24,12,4]
        //[a,        a*b ,   a*b*c   ,   a*b*c*d ] --> A
        //[d*c*b*a  ,d*c*b,  d*c,           d] --> B
        //[B[1]*1*A[-1] ,B[2]*A[0] , B[3]*A[1], A[2]*1*B[4(out)]]

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = nums[0];
        suffix[nums.length-1] = nums[nums.length-1];
        for(int i = 1; i < nums.length; i++)
        prefix[i] = prefix[i-1] * nums[i];
        for(int i = nums.length-1; i > 0; i--)
        suffix[i-1] = suffix[i]* nums[i-1];
        
        int p = -1;
        int s = 1;
        int pref = 1 , suf = 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(p < 0)
            pref = 1;
            else
            pref = prefix[p];
            
            if(s >= nums.length)
            suf = 1;
            else
            suf = suffix[s];

            nums[i] = pref * suf;

            p++;
            s++;
        }

        return nums;
    }
}