import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i :nums)
        freq.put(i , freq.getOrDefault(i,0)+1);

        for(Integer i:freq.keySet())
        {
            if(freq.get(i) > n/3)
            res.add(i);
        }
        
        return res;
    }
}