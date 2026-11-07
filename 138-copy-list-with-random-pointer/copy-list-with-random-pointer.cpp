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

class Solution {
public:
    Node* copyRandomList(Node* head) {
        if(head == nullptr)
        return head;

        Node *t = head;

        while(t != nullptr)
        {
            Node *temp = t->next;
            Node *copy = new Node(t->val);
            copy->next = temp;
            t->next = copy;
            t = temp;
        }

        t = head;

        while(t != nullptr)
        {
            if(t->random)
            t->next->random = t->random->next;

            t = t->next->next;
        }

        Node *h = head->next;
        Node *t2 = h;
        t = head;

        while(t != nullptr)
        {
            t->next = t->next->next;

            if(t2->next != nullptr)
            t2->next = t2->next->next;

            t = t->next;
            t2 = t2->next;
        }

        return h;
    }
};