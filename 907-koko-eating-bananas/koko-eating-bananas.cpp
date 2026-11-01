class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int max = 0;

        for(int i:piles)
        max = std::max(i ,max);

        int st = 1;
        int res = max;
        while(st <= max)
        {
            int mid = st + (max - st)/2;
            long hours = 0;
            for(int i : piles)                
            hours += i/mid + ((i % mid)!= 0);

            if(hours <= h)
            {
                res = std::min(res,mid);
                max = mid - 1;
            }
            else
            st = mid + 1;
        }

        return res;

    }
};