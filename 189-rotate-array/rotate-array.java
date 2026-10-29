class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;

        for(int i = 0 ; i < nums.length/2 ; i++)
        {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        for(int i = k  ; i < (nums.length+k)/2 ; i++)
        {
            int temp = nums[i];
            nums[i] = nums[nums.length - i + k -1];
            nums[nums.length - i + k - 1] = temp;
        }

       
        for(int i = 0 ; i < k/2 ; i++)
        {
            int temp = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - 1 - i] = temp;
        }
       
    }
}