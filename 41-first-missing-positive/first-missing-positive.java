import java.util.HashMap;
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int lowest = 1;
        for(int i = 0 ; i < nums.length ; i++)
        {
           if(nums[i] < 0)
           nums[i] = 0;
        }

        for(int i = 0; i < nums.length ; i++)
        {
            int ind = Math.abs(nums[i]) - 1;
            if(ind >= 0 && ind < nums.length)
            {
                if(nums[ind] >= 0)
                nums[ind] = nums[ind] != 0 ?-nums[ind] : -(nums.length + 1);
            }
        }
    for(int i:nums)
    {
        System.out.print(i+" ");
    }
        for(int i = 1 ; i <= nums.length ; i++)
        {
            if(nums[i-1] >= 0)
            {
                lowest = i;
                break;
            }
            else
            lowest++;
           
        }
        return lowest;
    }
}