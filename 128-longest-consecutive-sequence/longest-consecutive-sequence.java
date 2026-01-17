import java.util.HashSet;
class Solution {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> rel = new HashSet<>();
        HashSet<Integer>prevrels = new HashSet<>();
        int seq = 0;

        if(nums.length < 2)
        return nums.length;
        
        for(int i:nums)
        rel.add(i);

        for(int i:rel)
        {
            
            int post = i+1;
            if(rel.contains(post) && !prevrels.contains(post))
            {
                int temp = 1;
                while(rel.contains(post))
                {
                    prevrels.add(post);
                    post++;
                    temp++;
                }
                if(temp > seq)
                seq = temp;
            }
        }
        return seq==0?1:seq;
    }
}