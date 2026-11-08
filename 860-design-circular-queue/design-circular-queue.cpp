struct Node{
    int val;
    Node *next;

    Node(int v)
    {
        val = v;
        next = nullptr;
    }
    Node(int v , Node *n)
    {
        val = v;
        next = n;
    }

};

class MyCircularQueue {
public:
    Node *front , *rear ;
    int size , capacity;
    MyCircularQueue(int k) {
        front = nullptr , rear = nullptr;
        size = 0 , capacity = k;
    }
    
    bool enQueue(int value) {
        if(this->isFull())
        return false;

        if(this->isEmpty())
        {
            rear = new Node(value);
            front = rear;
            rear->next = front;
        }
        else
        {
            rear->next = new Node(value , front);
            rear = rear->next;
        }
        size++;
        return true;
    }
    
    bool deQueue() {
        if(this->isEmpty())
        return false;

        if(front == rear)
        front = rear = nullptr;
        else
        front = front->next;

        size--;
        return true;
    }
    
    int Front() {
        return front != nullptr ? front->val : -1;
    }
    
    int Rear() {
        return rear != nullptr ? rear->val : -1;
    }
    
    bool isEmpty() {
        return size == 0;
    }
    
    bool isFull() {
        return size == capacity;
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