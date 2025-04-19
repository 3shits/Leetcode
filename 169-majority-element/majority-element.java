import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
        int i;
        for(i = 0 ;  i < nums.length ; i++)
        {
            freq.putIfAbsent(nums[i],0);
            freq.computeIfPresent(nums[i],(k,v)->v+1);
            if((double)freq.get(nums[i]) > (nums.length/2))
            break;
        }
        return nums[i];
        
    }
    
}