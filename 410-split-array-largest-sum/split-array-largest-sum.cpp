class Solution {
public:
    int splitArray(vector<int>& nums, int k) {
        int st = 0 , end = 0 ;
        for(int n: nums)
        {
            if(n > st)
            st = n;
            end += n;
        }
        
        int res = end;

        while(st <= end)
        {
            int mid = st + (end - st)/2;
            int sub = 1;
            int sum = 0;
            for(int n : nums)
            {
                sum += n;
                if(sum > mid)
                {
                    sub++;
                    sum = n;
                }
            }

            if(sub <= k)
            {
                res = mid;
                end = mid - 1;
            }
            else
            st = mid + 1;
        }
        return res;
    }
};