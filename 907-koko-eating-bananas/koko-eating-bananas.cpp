#include <algorithm>
class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        // int max = 0;

        // for(int i:piles)
        // {
        //     if(i > max)
        //     max = i;
        // }

        int max = *std::max_element(piles.begin() , piles.end());

        int st = 1;
        int res = max;
        while(st <= max)
        {
            int mid = st + (max - st)/2;
            long hours = 0;
            for(int i : piles)                
            hours += ceil(i/(double)mid);

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