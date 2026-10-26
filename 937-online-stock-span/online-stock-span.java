
class StockSpanner {

    int[] prices;
    int[] spans;
    int front = -1;
    public StockSpanner() {
        prices = new int[1000];
        spans = new int[1000];
    }
    
    public int next(int price) {
        if(this.front == -1)
        {
            this.prices[++front] = price;
            this.spans[front] = 1;
            return 1;
        }
        
        int span = 1;
        while(this.prices[front] <= price)
        {
            span += this.spans[front];
            --front;

            if(front == -1)
            break;
        }

        this.prices[++front] = price;
        this.spans[front] = span;
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */