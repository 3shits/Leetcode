import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
        int elem = 0;
        for(int i = 0 ;  i < nums.length ; i++)
        {
            freq.putIfAbsent(nums[i],0);
            freq.computeIfPresent(nums[i],(k,v)->v+1);
        }
        for(Integer i : freq.keySet())
        {
            if((double)freq.get(i) > (nums.length/2))
            {
                elem = i;
                break;
            }
        }
        return elem;
        
    }
    
}