import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> diffs = new HashMap<>();
        for(int i = 0;  i < nums.length ; i++)
        {
            if(diffs.containsKey(target-nums[i]))
            {
                return new int[] {diffs.get(target-nums[i]),i};
            }
            diffs.put(nums[i],i);
        }
        return new int[] {-1,-1};
        
    }
}