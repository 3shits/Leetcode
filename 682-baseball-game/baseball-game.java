class Solution {
    public int calPoints(String[] operations) {
        int scores[] = new int[1000];
        int tail = -1;
        for(String op : operations )
        {
            switch(op){
            case "C":
            tail--;
            break;
            case "D":
            scores[++tail] = 2*scores[tail-1];
            break;
            case "+":
            scores[++tail] = scores[tail-1] + scores[tail-2];
            break;
            default:
                scores[++tail] = Integer.parseInt(op);
                break;
            }
        }
        int sum = 0;
        for(int i = 0 ; i<= tail ; i++)
        sum = sum+scores[i];

        return sum;
    }
}