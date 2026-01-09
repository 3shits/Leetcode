import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
        double threshold = nums.length/2;
        int max = 0;
        for(int i:nums)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
            if(freq.get(i) > threshold)
            max = i;
        }
        System.out.println(freq);
        return max;
    }
    
}