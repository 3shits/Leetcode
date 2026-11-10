#include <limits>

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        
        vector<int> *A = &nums1 , *B = &nums2;
        if(nums1.size() > nums2.size())
        B = &nums1 , A = &nums2;
        
        int m = A->size() , n = B->size();
        if(m == 0)
        {
            A = B;
            m = n;
        }

        int st = 0 , end = m - 1 , half = std::ceil((m + n)/2.0);
        cout << half << '\n';
        while(true)
        {
            int i = std::floor((double)st + (end - st)/2.0);
            int j = half - i - 2;

            double Al , Ar , Bl , Br;
            Al = i >= 0 ? (*A)[i] : numeric_limits<int>::min();
            Ar = i+1 < m ?(*A)[i+1] : numeric_limits<int>::max();
            Bl = j >= 0 ? (*B)[j] :numeric_limits<int>::min();
            Br = j+1 < n ?(*B)[j+1] : numeric_limits<int>::max();
            if(Al <= Br && Bl <= Ar)
            {
                if((m+n) % 2 != 0)
                return std::max(Al , Bl);
                else
                return ((double)std::max(Al,Bl) + std::min(Ar,Br))/2.0;
            }
            else if(Al > Br)
            end = i - 1;
            else
            st = i + 1;
        }
    }
};