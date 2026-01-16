import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i :nums)
        freq.put(i , freq.getOrDefault(i,0)+1);

        for(int k:freq.keySet())
        {
            if(freq.get(k) > nums.length/3)
            res.add(k);
        }
        
        return res;
    }
}