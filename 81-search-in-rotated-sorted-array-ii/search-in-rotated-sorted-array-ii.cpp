class Solution {
public:
    bool search(vector<int>& nums, int target) {
        int compare = 0;
        int st = 0 , end = nums.size()-1;
        
        
        while(st <= end && compare < nums.size())
        {
            int mid = st + (end - st)/2;
            cout << nums[mid] << '\n';
            cout << nums[compare] << '\n';
            if(nums[mid] > target)
            {
                if(target > nums[compare])
                end = mid - 1;
                else if(target < nums[compare])
                {
                    if(nums[mid] > nums[compare])
                    st = mid + 1;
                    else if(nums[mid] < nums[compare])
                    end = mid - 1;
                    else
                    {
                        compare++;
                        if(compare == mid)
                        st = compare + 1;
                    }
                }
                else
                return true;
                
            }
            else if(nums[mid] < target)
            {
                if(nums[mid] > nums[compare])
                st = mid + 1;
                else if(nums[mid] < nums[compare])
                {
                    if(target < nums[compare])
                    st = mid + 1;
                    else if(target > nums[compare])
                    end = mid - 1;
                    else
                    return true;
                }
                else
                {
                        compare++;
                        if(compare == mid)
                        st = compare + 1;
                }
            }
            else
            return true;
        }
        return false;
    }
};