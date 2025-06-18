import java.util.Arrays;
class Solution {

    public void rotate(int[] nums, int k) {
        int n = (k < nums.length - 1) ? k : (k%(nums.length));
        int nums_cpy[] = Arrays.copyOfRange(nums,nums.length-n,nums.length);
        for(int i = nums.length - (n+1) ; i >= 0 ; i--)
        {
            nums[i+n] = nums[i];
        }
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = nums_cpy[i];
        }
        

}
}