import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> diffs = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0 ; i < nums.length ; i++)
        {
            diffs.put(target-nums[i] , i);
        }
        System.out.println(diffs);
        for(int i = 0 ; i < nums.length;i++)
        {
            if(diffs.get(nums[i]) != null)
            {
                if(i != diffs.get(nums[i]))
                {
                    res = new int[]{ i , diffs.get(nums[i])};
                    break;
                }
            }
        }
        
        return res;
        
    }
}