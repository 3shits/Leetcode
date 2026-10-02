import java.util.Stack;

class MinStack {

    Stack arr;
    Integer min;

    public MinStack() {
        arr = new Stack<Integer>();
        min = null;
    }


    public void push(int value) {
        this.arr.push(value);
        if(this.min == null)
        this.min = value;
        if(value < min)
        this.min = value;
        return;
    }
    
    public void pop() {
        int popped = (int) arr.pop();
        if(popped == this.min)
        {
            
            if(!arr.empty())
            {
                this.min = (Integer) arr.peek();
                for(int i = 0;  i < arr.size() ; i++)
                {
                    if((int)arr.elementAt(i) < (int)this.min)
                    this.min = (Integer) arr.elementAt(i);
                }
            }
            else
            this.min = null;
        }
        return;
    }
    
    public int top() {
        return (int)arr.peek();
    }
    
    public int getMin() {
        return this.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */