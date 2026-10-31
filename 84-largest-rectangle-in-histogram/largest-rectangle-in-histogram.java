class Solution {
    public int largestRectangleArea(int[] heights) {
        int[][] arr = new int[heights.length][2];
        int top = -1;
        int maxArea = 0;
        arr[++top] = new int[]{0,heights[0]};
        // arr.push(new int[]{0,heights[0]});
        for(int i = 1;  i < heights.length ; i++)
        {
            int start = i;
            while(top >= 0 && arr[top][1] > heights[i])
            {
                int[] popped = arr[top--];
                int area = popped[1] * (i - popped[0]);
                if(area > maxArea)
                maxArea = area;
                start = popped[0];
            }
            arr[++top] = new int[]{start,heights[i]}; 
            // arr.push(new int[]{start , heights[i]});
        }

        while(top >= 0)
        {
             int[] popped = arr[top--];
            int area = popped[1] * (heights.length - popped[0]);
            if(area > maxArea)
            maxArea = area;
        }

        return maxArea;
        
    }
}