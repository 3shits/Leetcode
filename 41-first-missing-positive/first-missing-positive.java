import java.util.HashSet;
class Solution {
    public int firstMissingPositive(int[] nums) {
       int lowest = 1;
       Set<Integer> N = new HashSet<>();
       for(int i:nums)
       N.add(i);

       while(N.contains(lowest))
       lowest++;

        return lowest;
    }
}