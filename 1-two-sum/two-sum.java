import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> diffs = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            diffs.put(target-nums[i] , i);
        }
       
        for(int i = 0 ; i < nums.length;i++)
        {
            if(diffs.get(nums[i]) != null)
            {
                if(i != diffs.get(nums[i]))
                {
                    int[] res = { i , diffs.get(nums[i])};
                    return res;
                }
            }
        }
        return null;
    }
}