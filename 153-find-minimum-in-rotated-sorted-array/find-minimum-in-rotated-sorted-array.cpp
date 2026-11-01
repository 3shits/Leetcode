class Solution {
public:
    int findMin(vector<int>& nums) {
        int target = nums[0] , res = 0;
        int st = 0 , end = nums.size() - 1;

        while(st <= end)
        {

            int mid = st + (end-st)/2;
            cout << mid << '\n';
            if(nums[mid] >= target)
            {
                if(mid != nums.size() - 1 && nums[mid] > nums[mid+1])
                {
                    res = mid+1;
                    break;
                }
                else
                st = mid + 1;
            }
            if(nums[mid] < target)
            {
                if(mid != 0 && nums[mid] < nums[mid-1] )
                {
                    res = mid;
                    break;
                }
                else
                end = mid - 1;
            }
        }

        return nums[res];
    }
};