class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int st = 0 , end = (matrix.size() * matrix[0].size()) - 1;
        while(st <= end)
        {
            int mid = st + (end - st)/2;
            int row = mid / matrix[0].size();
            int col = mid % matrix[0].size();

            if(matrix[row][col] < target)
            st = mid + 1;
            else if(matrix[row][col] > target)
            end = mid - 1;
            else
            return true;
        }
        return false;
    }
};