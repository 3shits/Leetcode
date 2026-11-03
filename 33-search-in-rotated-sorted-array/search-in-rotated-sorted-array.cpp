class Solution {
public:
    int search(vector<int>& nums, int target) {
        int compare = nums[0];
        int st = 0 , end = nums.size()-1;
        
        
        while(st <= end)
        {
            int mid = st + (end - st)/2;
            if(nums[mid] > target)
            {
                if(target >= compare)
                end = mid - 1;
                else
                {
                    if(nums[mid] >= compare)
                    st = mid + 1;
                    else
                    end = mid - 1;
                }
            }
            else if(nums[mid] < target)
            {
                if(nums[mid] >= compare)
                st = mid + 1;
                else
                {
                    if(target < compare)
                    st = mid + 1;
                    else
                    end = mid - 1;
                }
            }
            else
            return mid;
        }
        return -1;
    }
};