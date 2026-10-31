class Solution {
    public int trap(int[] height) {
        int i = 0 ,j = height.length - 1;
        int  maxRight = height[j] , maxLeft = height[i] , water = 0 ;

        while(i < j)
        {
            if(maxLeft < maxRight)
            {
                i++;
                maxLeft = Math.max(maxLeft,height[i]);
                water += maxLeft - height[i];
            }
            else
            {
                j--;
                maxRight = Math.max(maxRight,height[j]);
                water += maxRight - height[j];
            }
        }
        return water;
    }
}