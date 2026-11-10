#include <limits>
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        
        int m = nums1.size() , n = nums2.size();

        if(m > n)
        return findMedianSortedArrays(nums2,nums1);

        int st = 0 , end = m;

        while(st <= end)
        {
            int i = (st + end)/2;
            int j = (m+n+1)/2 - i;

            int Al = i == 0 ? numeric_limits<int>::min() : nums1[i - 1];
            int Ar = i == m ? numeric_limits<int>::max() : nums1[i];
            int Bl = j == 0 ? numeric_limits<int>::min() : nums2[j - 1];
            int Br = j == n ? numeric_limits<int>::max() : nums2[j];

            if(Al <= Br && Bl <= Ar)
            {
                if((m+n)%2 == 0)
                return ((double)max(Al,Bl) + min(Ar,Br))/2.0;
                else
                return max(Al,Bl);
            }
            else if(Al > Br)
            end = i - 1;
            else
            st = i + 1;
        }

        return 0.0;
    }
};