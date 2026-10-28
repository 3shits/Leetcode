import java.util.ArrayList;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<>();

        for(int a = 0 ; a < nums.length  ; a++)
        {
            if(a > 0 && nums[a] == nums[a-1])
            continue;
            for(int b = a+1 ; b < nums.length; b++)
            {
                if(b > a+1 && nums[b] == nums[b-1])
                continue;
                
                int c = b+1 , d = nums.length - 1;
                while(c < d)
                {
                    long sum = (long)nums[a]+ (long)nums[b]+ (long)nums[c]+ (long)nums[d];
                    if(sum > (long)target)
                    d--;
                    else if(sum < (long)target)
                    c++;
                    else
                    {
                        ArrayList<Integer> found = new ArrayList<>();
                        found.add(nums[a]);
                        found.add(nums[b]);
                        found.add(nums[c]);
                        found.add(nums[d]);
                        res.add(found);
                        c++;
                        d--;

                        while(nums[c] == nums[c-1] && c < d)
                        c++;
                        while(nums[d] == nums[d+1] && c < d)
                        d--;
                    }
                }
            }
        }
        return res;
    }
}