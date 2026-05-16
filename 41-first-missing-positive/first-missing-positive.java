import java.util.HashMap;
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int lowest = 1;
        for(int i : nums)
        {
            if(i > 0)
            {
                map.put(i,0);
            }
        }

        for(int i = 1 ;  i <= nums.length+1 ;i++)
        {
            if(!map.containsKey(i))
            {
                lowest = i;
                break;
            }
        }
        
    return lowest;
        
    }
}