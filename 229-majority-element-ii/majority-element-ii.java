import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int threshold = n/3;
        HashMap<Integer,Integer> freq = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i :nums)
        {
            freq.put(i , freq.getOrDefault(i,0)+1);
            if(freq.get(i) > threshold && !res.contains(i))
            res.add(i);
        }

        // for(Integer i:freq.keySet())
        // {
            
        // }
        
        return res;
    }
}