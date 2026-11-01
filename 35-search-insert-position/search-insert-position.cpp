class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int st = 0 , end = nums.size() - 1;
        int mid = 0;
        while(st <= end)
        {
            mid = st + (end - st)/2;
            if(nums[mid] > target)
            end = mid - 1;
            else if(nums[mid] < target)
            st = mid +1;
            else
            return mid;
        }

        return nums[mid] > target ? mid  : mid + 1;
    }
};