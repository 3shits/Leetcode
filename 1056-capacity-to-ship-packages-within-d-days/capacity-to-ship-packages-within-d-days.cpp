class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int sum = 0 , max = 0;
        for(int w : weights)
        {
        sum += w;
        max = std::max(w,max);
        }

        int st = max , res = sum;
        while(st <= sum)
        {

            int mid = st + (sum - st)/2;
            
            int count = 1 , total = mid;
            for(int w : weights)
            {
                if(total - w < 0)
                {
                    count++;
                    total = mid;
                }

                total-= w;
            }
            
            if(count <= days)
            {
                res = std::min(res,mid);
                sum = mid - 1;
            }
            else 
            st = mid + 1;
            
        }
        return res;
    }
};