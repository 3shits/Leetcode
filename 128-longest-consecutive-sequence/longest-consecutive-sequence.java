import java.util.HashSet;
class Solution {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> rel = new HashSet<>();
        int seq = 0;

        if(nums.length < 2)
        return nums.length;
        
        for(int i:nums)
        rel.add(i);

        for(int i:rel)
        {
           if(!rel.contains(i-1))
           {
                int post = i+1;
                int tempseq = 1;
                while(rel.contains(post))
                {
                    post++;
                    tempseq++;
                }
                if(tempseq > seq)
                seq = tempseq;
           }
        }
        return seq;
    }
}