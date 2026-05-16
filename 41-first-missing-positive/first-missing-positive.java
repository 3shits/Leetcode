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

        for(int i: nums)
        {
            if(map.containsKey(lowest))
            lowest++;
        }
        
    return lowest;
        
}
}