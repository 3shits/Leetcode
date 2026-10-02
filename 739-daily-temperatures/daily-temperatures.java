import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> arr = new Stack<>();
        int[] answers = new int[temperatures.length];
        for(int i = 0; i < temperatures.length ; i++)
        {
            while(!arr.empty())
            {
                int idx = arr.peek();
                if(temperatures[i] > temperatures[idx])
                {
                    answers[idx] = i-idx;
                    arr.pop();
                }
                else
                break;
            }
            arr.push(i);
        }

        return answers;
    }
}