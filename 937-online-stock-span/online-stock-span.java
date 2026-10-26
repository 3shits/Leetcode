import java.util.Stack;
class StockSpanner {

    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        if(this.st.isEmpty())
        {
            this.st.push(new int[]{price,1});
            return 1;
        }
        int[] top = this.st.peek();
        int span = 1;
        while(top[0] <= price)
        {
            span += top[1];
            this.st.pop();

            if(this.st.isEmpty())
            break;
            
            top = this.st.peek();
        }

        this.st.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */