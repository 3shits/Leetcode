class Solution {
public:
    int mySqrt(int x) {
        int st = 1 , end = x , ans = 0;

        while(st <= end)
        {
            int mid = st + (end -st)/2;
            if((long)mid * mid <= x)
            {
                ans = mid;
                st = mid + 1;
            }
            else
            end = mid - 1;
        }

        return ans;

    }
};