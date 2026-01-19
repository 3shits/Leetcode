import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);
        int pref = 0;
        for (int num : nums) {
            pref += num;
            result += count.getOrDefault(pref - k, 0);
            count.put(pref,count.getOrDefault(pref,0)+1);
        }
        return result;
    }
}