import java.util.HashMap;
import java.util.ArrayList;
class Solution {

    public void heapifyUp(List<Map.Entry<Integer,Integer>> pqueue , int i)
    {
        if(i != 0)
        {
            int parent = (i-1)/2;
            if(pqueue.get(i).getValue() < pqueue.get(parent).getValue())
            {
                Map.Entry<Integer,Integer> temp = pqueue.get(i);
                pqueue.set(i , pqueue.get(parent));
                pqueue.set(parent , temp);
                heapifyUp(pqueue , parent);
            }
        }
    }

    public void heapifyDown(List<Map.Entry<Integer,Integer>> pqueue , int n , int i)
    {
        int smallest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && pqueue.get(left).getValue() < pqueue.get(smallest).getValue())
        smallest = left;
        if(right < n && pqueue.get(right).getValue() < pqueue.get(smallest).getValue())
        smallest = right;

        if(smallest != i)
        {
            Map.Entry<Integer,Integer> temp = pqueue.get(i);
            pqueue.set(i,pqueue.get(smallest));
            pqueue.set(smallest,temp);

            heapifyDown(pqueue,pqueue.size(), smallest);
        }
            
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Map.Entry<Integer,Integer>> pqueue = new ArrayList<>();
         int res[] = new int[k];
        for(int i:nums)
        map.put(i , map.getOrDefault(i,0)+1);

        System.out.println(map);
        for(Map.Entry<Integer,Integer> freq:map.entrySet())
        {
            pqueue.add(freq);
            int len = pqueue.size();
            heapifyUp(pqueue,len-1);
            if(pqueue.size() > k)
            {
            Map.Entry<Integer,Integer> temp = pqueue.get(len - 1);
            pqueue.set(len -1, pqueue.get(0));
            pqueue.set(0, temp);
            pqueue.remove(len-1);
            heapifyDown(pqueue,pqueue.size(),0);
            }
        }
        System.out.println(pqueue);
        for(int i = 0 ; i<k ;i++)
        res[i] = pqueue.get(i).getKey();
        return res;

    }
}