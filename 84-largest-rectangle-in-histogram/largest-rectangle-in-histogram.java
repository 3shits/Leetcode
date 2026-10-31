class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> arr = new Stack<>();
        int maxArea = 0;
        arr.push(new int[]{0,heights[0]});
        for(int i = 1;  i < heights.length ; i++)
        {
            int start = i;
            while(!arr.isEmpty() && arr.peek()[1] > heights[i])
            {
                int[] popped = arr.pop();
                int area = popped[1] * (i - popped[0]);
                if(area > maxArea)
                maxArea = area;
                start = popped[0];
            }
            arr.push(new int[]{start , heights[i]});
        }

        while(!arr.isEmpty())
        {
            int[] popped = arr.pop();
            int area = popped[1] * (heights.length - popped[0]);
            if(area > maxArea)
            maxArea = area;
        }

        return maxArea;
        
    }
}