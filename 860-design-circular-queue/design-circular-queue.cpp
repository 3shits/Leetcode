class MyCircularQueue {
public:
    int *arr , size , front = 0 , rear = 0;
    MyCircularQueue(int k) {
        arr = new int[k];
        size = k;
    }
    
    bool enQueue(int value) {
        if(this->isFull())
        return false;
        

        arr[rear % size] = value;
        rear++;
        return true;
    }
    
    bool deQueue() {
        if(this->isEmpty())
        return false;

        front++;
        return true;
    }
    
    int Front() {
        if(!this->isEmpty())
        return arr[front % size];

        return -1;
    }
    
    int Rear() {
        if(!this->isEmpty())
        return arr[(rear-1) % size];

        return -1;
    }
    
    bool isEmpty() {
        return front == rear ;
    }
    
    bool isFull() {
        return rear - front == size;
    }
};

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue* obj = new MyCircularQueue(k);
 * bool param_1 = obj->enQueue(value);
 * bool param_2 = obj->deQueue();
 * int param_3 = obj->Front();
 * int param_4 = obj->Rear();
 * bool param_5 = obj->isEmpty();
 * bool param_6 = obj->isFull();
 */