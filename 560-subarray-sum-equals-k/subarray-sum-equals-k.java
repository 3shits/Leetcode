import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        if(nums.length == 1)
        return k== nums[0] ? 1 : 0;
        
        int prefix[] = new int[nums.length+1];
        for(int i = 1 ;  i < prefix.length ; i++)
        prefix[i] = nums[i-1]+prefix[i-1];
    
        int offset = 1;
        int pt1 = 0 , pt2 = 0+offset;
        int count = 0 , sum = 0;
        while(offset != prefix.length - 1)
        {
            if(pt2 == prefix.length)
            {
                pt1 = 0;
                offset++;
                pt2 = 0+offset;
            }
            sum = prefix[pt2] - prefix[pt1];

            if(sum == k)
            count++;
            pt1++;
            pt2++;
        }
        return count;
    }
}