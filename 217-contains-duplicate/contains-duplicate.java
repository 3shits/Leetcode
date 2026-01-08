import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashMap<Integer,Integer> seen = new HashMap<Integer,Integer>();
        for(int num:nums)
        {
            seen.put(num,seen.getOrDefault(num,0)+1);
            if(seen.getOrDefault(num,0) != 1)
            return true;
        }
        return false;
    }
}
