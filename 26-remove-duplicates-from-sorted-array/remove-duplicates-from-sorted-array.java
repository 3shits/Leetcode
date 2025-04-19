class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0 , k = 1;
        for(int i = 0 ;  i < nums.length ; i++)
        {
            if(nums[i] != nums[p1])
            {
                k++;
                p1++;
                nums[p1] = nums[i]; 
                
            }
        }
        return k;
    }
}