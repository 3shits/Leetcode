import java.util.ArrayList;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int k = 0 ; k < nums.length ; k++)
        {
            if( k > 0 && nums[k] == nums[k-1])
            continue;

            int i = k+1 , j = nums.length - 1;
            while(i <j)
            {
                int sum = nums[i] +nums[j]+nums[k];
                if(sum > 0)
                j--;
                else if(sum < 0)
                i++;
                else
                {
                    List<Integer> found = new ArrayList<>();
                    found.add(nums[i]);
                    found.add(nums[j]);
                    found.add(nums[k]);
                    res.add(found);
                    i++;
                    while(nums[i] == nums[i-1] && i <j)
                    i++;
                }
            }
        }
        return res;
    }
}