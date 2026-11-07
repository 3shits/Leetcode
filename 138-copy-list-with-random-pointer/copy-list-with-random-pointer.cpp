/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

#import <unordered_map>

class Solution {
public:
    Node* copyRandomList(Node* head) {
        if(head == nullptr)
        return head;

        Node *t = head;
        unordered_map<Node*,Node*> copies;

        while(t)
        {
            copies[t] = new Node(t->val);
            t = t->next;
        }

        t = head;
        Node *h = copies[t];
        Node *t2 = h;
        while(t)
        {
            t2->random = copies[t->random];
            t2->next = copies[t->next];
            t = t->next;
            t2 = t2->next;
        }
       
        return h;
    }
};