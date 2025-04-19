class Solution {
    public void moveZeroes(int[] nums) {
        int num_ptr = 0;
        for(int i = 0 ;  i < nums.length ; i++)
        {
            if(nums[i] != 0 && num_ptr < nums.length)
            {
                nums[num_ptr] = nums[i];
                if(num_ptr != i)
                nums[i] = 0;
                num_ptr++;
            }
           
        }
    }
}