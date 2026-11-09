#import <unordered_map>

struct Node{
    int key;
    int value;
    Node *next;
    Node *prev;

    Node(int k ,int v , Node* n , Node* p)
    {
        key = k;
        value = v;
        next = n;
        prev = p;
    }
};

class LRUCache {
public:
    int capacity , size = 0;
    Node *front , *rear;
    unordered_map<int,Node*> nodes;
    LRUCache(int capacity) {
        this->capacity = capacity;
    }
    
    int get(int key) {
        if(nodes[key] == nullptr)
        return -1;
        else
        {
            Node *used = nodes[key];
            if(used == front)
            return used->value;

            if(used == rear)
            {
                rear = rear->prev;
                rear->next = nullptr;
            }
            else
            {
                used->prev->next = used->next;
                used->next->prev = used->prev;
            }

            used->next = front;
            used->prev = nullptr;
            front->prev = used;
            front = used;
            return used->value;
        }
    }
    
    void put(int key, int value) {
        if(this->get(key) != -1)
        {
            nodes[key]->value = value;
            return;
        }

        Node *newNode;
        if(size == 0)
        {
            newNode = new Node(key ,value , nullptr , nullptr);
            front = newNode;
            rear = newNode;
            size++;
        }
        else
        {
            if(size > capacity - 1)
            {
                nodes.erase(rear->key);
                rear = rear->prev;
            }
            else
            size++;
            
            newNode = new Node(key ,value , front , nullptr);
            front->prev = newNode;

            if(!rear)
            rear = newNode;

            front = newNode;
        }

        nodes[key] = newNode;
    }
};

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache* obj = new LRUCache(capacity);
 * int param_1 = obj->get(key);
 * obj->put(key,value);
 */