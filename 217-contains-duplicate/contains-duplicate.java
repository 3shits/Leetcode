import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashMap<Integer,Integer> seen = new HashMap<Integer,Integer>();
        for(int num : nums)
        {
            seen.put(Integer.valueOf(num),seen.get(num) ==null?1:seen.get(num)+1);
            if(seen.get(num)> 1)
            return true;
        }
        return false;
    }
}
