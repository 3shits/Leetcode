class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length*2];
        for(int i = 0,c = 0; i < ans.length; i++ , c++)
        {
           ans[i] = nums[c];
           if(c == nums.length - 1)
           c = -1;
        }
        return ans;
    }
}