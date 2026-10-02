class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        int[] stack = new int[n];
        int top = -1;

        int[] answers = new int[n];

        for (int i = 0; i < n; i++) {

            while (top >= 0 && temperatures[i] > temperatures[stack[top]]) {
                int idx = stack[top--];
                answers[idx] = i - idx;
            }

            stack[++top] = i;
        }

        return answers;
    }
}